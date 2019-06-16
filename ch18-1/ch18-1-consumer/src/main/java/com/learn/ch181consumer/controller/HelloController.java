package com.learn.ch181consumer.controller;

import com.learn.ch181consumer.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/12
 * @Time: 20:14
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping("/{name}")
    public String hello(@PathVariable(name = "name") String name) {
        return helloFeignService.hello(name) + "\n" + new Date().toString();
    }

}
