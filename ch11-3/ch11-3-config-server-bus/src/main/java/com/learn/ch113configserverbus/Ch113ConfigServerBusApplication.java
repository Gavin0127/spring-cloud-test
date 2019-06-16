package com.learn.ch113configserverbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ch113ConfigServerBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch113ConfigServerBusApplication.class, args);
    }

}
