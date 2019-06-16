package com.learn.ch111configclient.controller;

import com.learn.ch111configclient.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/11
 * @Time: 17:33
 */
@RestController
public class ConfigController {

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping("/getConfigInfo")
    public String getConfigInfo() {
        return configProperties.getConfig();
    }

}
