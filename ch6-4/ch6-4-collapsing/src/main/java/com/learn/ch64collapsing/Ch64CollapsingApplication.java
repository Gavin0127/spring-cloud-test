package com.learn.ch64collapsing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class Ch64CollapsingApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch64CollapsingApplication.class, args);
    }

}
