package com.learn.ch101userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/21 18:21
 */
@RestController
public class UserController {

    @GetMapping("/getDefaultUser")
    public String getDefaultUser() {
        return
    }

}
