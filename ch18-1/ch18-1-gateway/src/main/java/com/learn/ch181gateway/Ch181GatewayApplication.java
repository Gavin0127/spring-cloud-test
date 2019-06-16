package com.learn.ch181gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch181GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch181GatewayApplication.class, args);
    }

}
