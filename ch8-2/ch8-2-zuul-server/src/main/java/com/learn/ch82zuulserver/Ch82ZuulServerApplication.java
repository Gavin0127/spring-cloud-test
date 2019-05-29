package com.learn.ch82zuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Ch82ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch82ZuulServerApplication.class, args);
    }

}
