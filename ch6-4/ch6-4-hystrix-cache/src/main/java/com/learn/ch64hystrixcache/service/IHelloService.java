package com.learn.ch64hystrixcache.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheRemove;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 15:50
 */
public interface IHelloService {
    @CacheResult
    @HystrixCommand
    String getUserById(Integer id);

    @CacheResult
    @HystrixCommand(commandKey = "getUser")
    String getUserToCommandKey(@CacheKey Integer id);

    @CacheRemove(commandKey = "getUser")
    @HystrixCommand
    String updateUser(@CacheKey Integer id);
}
