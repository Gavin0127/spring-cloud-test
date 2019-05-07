package com.learn.ch45provider.controller;

import com.learn.ch45provider.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 15:17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(User user) {
        return "hello, " + user.getName();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(User user) {
        return "hello, " + user.getName();
    }

}
