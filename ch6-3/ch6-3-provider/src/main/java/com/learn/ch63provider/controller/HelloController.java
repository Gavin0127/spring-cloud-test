package com.learn.ch63provider.controller;

import com.learn.ch63provider.service.IConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 20:06
 */
@RestController
public class HelloController {

    @Autowired
    private IConsumeService consumeService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam String userName) {
        return "this is the real user: gavin";
    }

    @GetMapping("/getDashboard")
    public List<String> getDashboard() {
        List<String> provider = new ArrayList<String>();
        provider.add("hystrix dashboard");
        return provider;
    }

    @GetMapping("/helloService")
    public String getHelloData() {
        return consumeService.getHelloServiceData();
    }

}
