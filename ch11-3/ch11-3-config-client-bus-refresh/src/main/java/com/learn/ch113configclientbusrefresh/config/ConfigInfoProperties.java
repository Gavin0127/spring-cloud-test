package com.learn.ch113configclientbusrefresh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/12
 * @Time: 12:13
 */
@Component
@ConfigurationProperties(prefix = "learn.springcloud")
public class ConfigInfoProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
