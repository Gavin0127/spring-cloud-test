package com.learn.ch111configclient.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/11
 * @Time: 17:33
 */
@Component
@ConfigurationProperties(prefix = "learn.springcloud")
@Setter
@Getter
public class ConfigProperties {

    private String config;

}
