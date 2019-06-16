package com.learn.ch181eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch181EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch181EurekaApplication.class, args);
    }

}
