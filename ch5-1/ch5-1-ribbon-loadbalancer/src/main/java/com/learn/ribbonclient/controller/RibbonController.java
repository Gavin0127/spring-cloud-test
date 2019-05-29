package com.learn.ribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 11:01
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add(int a, int b) {
        String result = restTemplate
                .getForObject("http://CH5-1-CLIENT/add?a=" + a + "&b=" + b,
                              String.class);
        System.out.println(result);
        return result;
    }

}
