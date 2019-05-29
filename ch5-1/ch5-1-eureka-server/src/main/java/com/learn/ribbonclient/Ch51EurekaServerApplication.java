package com.learn.ribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch51EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch51EurekaServerApplication.class, args);
    }

}
