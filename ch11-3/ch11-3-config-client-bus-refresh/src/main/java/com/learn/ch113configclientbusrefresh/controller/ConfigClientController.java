package com.learn.ch113configclientbusrefresh.controller;

import com.learn.ch113configclientbusrefresh.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/12
 * @Time: 12:13
 */
@RestController
@RefreshScope
@RequestMapping("configConsumer")
public class ConfigClientController {

    @Autowired
    private ConfigInfoProperties properties;

    @GetMapping("/getConfigInfo")
    public String getConfigInfo() {
        return properties.getConfig();
    }


}
