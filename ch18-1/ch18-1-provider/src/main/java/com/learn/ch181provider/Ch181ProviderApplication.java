package com.learn.ch181provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch181ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch181ProviderApplication.class, args);
    }

}
