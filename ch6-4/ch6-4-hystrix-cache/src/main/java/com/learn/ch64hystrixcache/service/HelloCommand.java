package com.learn.ch64hystrixcache.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 12:13
 */
public class HelloCommand extends HystrixCommand<String> {

    private RestTemplate restTemplate;

    private Integer id;

    public HelloCommand(RestTemplate restTemplate, Integer id) {
        super(HystrixCommandGroupKey.Factory.asKey("groupHello"));
        this.restTemplate = restTemplate;
        this.id = id;
    }

    @Override
    protected String run() throws Exception {
        String result =
                restTemplate.getForObject("http://ch6-4-provider/getUserById" +
                                          "/{1}",
                                          String.class, id);
        System.out.println(result);
        return result;
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(id);
    }

    @Override
    protected String getFallback() {
        return "this is the hello Fallback!";
    }
}
