package com.learn.ch64hystrixcache.service.impl;

import com.learn.ch64hystrixcache.service.IHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 15:50
 */
@Component
public class HelloServiceImpl implements IHelloService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @CacheResult
    @HystrixCommand
    public String getUserById(Integer id) {
        String result = restTemplate
                .getForObject("http://ch6-4-provider/getUserById/{1}",
                              String.class, id);
        LOGGER.info(result);
        return result;
    }

    @CacheResult
    @HystrixCommand(commandKey = "getUser")
    @Override
    public String getUserToCommandKey(@CacheKey Integer id) {
        String result = restTemplate
                .getForObject("http://ch6-4-provider/getUserById/{1}",
                              String.class, id);
        LOGGER.info(result);
        return result;
    }

    @CacheRemove(commandKey = "getUser")
    @HystrixCommand
    @Override
    public String updateUser(@CacheKey Integer id) {
        LOGGER.info("删除getUser缓存");
        return "update success";
    }

}
