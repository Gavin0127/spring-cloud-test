package com.learn.ch61clientservice.controller;

import com.learn.ch61clientservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 16:40
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam String userName) throws Exception {
        return userService.getUser(userName);
    }

}
