package com.learn.ch61clientservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 16:39
 */
public interface IUserService {
    @HystrixCommand(fallbackMethod = "defaultUser")
    String getUser(String userName) throws Exception;
}
