package com.learn.ch63hello.service.impl;

import com.learn.ch63hello.service.IHelloService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 18:28
 */
@Component
public class HelloFallbackServiceImpl implements IHelloService {

    @Override
    public String getUser(String userName) {
        return "the user does not exist!";
    }

    @Override
    public List<String> getDashboard() {
        return new ArrayList<>();
    }
}
