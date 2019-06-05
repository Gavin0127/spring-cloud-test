package com.learn.ch101dataservice.controller;

import com.learn.ch101common.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/3
 * @Time: 22:36
 */
@RestController
public class DataController {

    @GetMapping("/getDefaultUser")
    public User getDefaultUser() {
        return new User("100", "bill");
    }

    @GetMapping("/getContextUserId")
    public String getContextUserId() {
        return "10000";
    }

    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        List<String> provider = new ArrayList<String>();
        provider.add("Beijing Company");
        provider.add("Shanghai Company");
        provider.add("Shenzhen Company");
        return provider;
    }

}
