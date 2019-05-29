package com.learn.ch63hello.controller;

import com.learn.ch63hello.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 18:21
 */
@RestController
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam String userName) {
        return this.helloService.getUser(userName);
    }

    @GetMapping("/getDashboard")
    public List<String> getDashboard() {
        return helloService.getDashboard();
    }

    @GetMapping("/helloService")
    public String helloData() {
        return "hello service";
    }
}
