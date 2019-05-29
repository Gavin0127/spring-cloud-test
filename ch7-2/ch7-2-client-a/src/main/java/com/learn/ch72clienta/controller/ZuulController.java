package com.learn.ch72clienta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/15 12:17
 */
@RestController
public class ZuulController {

    @GetMapping("/add")
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

}
