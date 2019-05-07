package com.learn.ch45eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch45EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch45EurekaServerApplication.class, args);
    }

}
