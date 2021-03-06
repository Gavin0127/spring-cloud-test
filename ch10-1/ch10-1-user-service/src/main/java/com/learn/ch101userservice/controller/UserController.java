package com.learn.ch101userservice.controller;

import com.learn.ch101common.vo.User;
import com.learn.ch101userservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/21 18:21
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getDefaultUser")
    public User getDefaultUser() {
        return userService.getDefaultUser();
    }

    @GetMapping("/getContextUserId")
    public String getContextUserId() {
        return userService.getContextUserId();
    }

    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        return userService.getProviderData();
    }



}
