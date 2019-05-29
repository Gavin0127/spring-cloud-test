package com.learn.ch61clientservice.service.impl;

import com.learn.ch61clientservice.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 16:40
 */
@Component
public class UserServiceImpl implements IUserService {

    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String userName) throws Exception {
        if (userName.equals("spring")) {
            return "this is real user";
        } else {
            throw new Exception();
        }
    }

    public String defaultUser(String userName) {
        return "this user does not exist in this system!";
    }

}
