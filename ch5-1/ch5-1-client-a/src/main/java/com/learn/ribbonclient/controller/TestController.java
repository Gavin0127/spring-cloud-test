package com.learn.ribbonclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 10:56
 */
@RestController
public class TestController {

    @GetMapping("/add")
    public String add(int a, int b, HttpServletRequest request) {
        return " From port: " + request.getServerPort() + ", Result: " +
               (a + b);
    }

}
