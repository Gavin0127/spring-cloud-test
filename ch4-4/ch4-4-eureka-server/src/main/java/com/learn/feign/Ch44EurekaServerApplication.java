package com.learn.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch44EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch44EurekaServerApplication.class, args);
    }

}
