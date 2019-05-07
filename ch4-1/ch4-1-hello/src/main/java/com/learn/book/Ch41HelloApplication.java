package com.learn.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch41HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch41HelloApplication.class, args);
    }

}
