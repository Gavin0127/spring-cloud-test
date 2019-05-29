package com.learn.ribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch51RibbonLoadbalancerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch51RibbonLoadbalancerApplication.class, args);
    }

}
