package com.learn.ch45provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch45ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch45ProviderApplication.class, args);
    }

}
