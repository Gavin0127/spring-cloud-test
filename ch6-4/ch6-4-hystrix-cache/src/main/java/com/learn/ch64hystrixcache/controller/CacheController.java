package com.learn.ch64hystrixcache.controller;

import com.learn.ch64hystrixcache.service.HelloCommand;
import com.learn.ch64hystrixcache.service.IHelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 12:17
 */
@RestController
public class CacheController {

    private static final Logger
            LOGGER = LoggerFactory.getLogger(CacheController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IHelloService helloService;

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable Integer id) {
        HelloCommand one = new HelloCommand(restTemplate, id);
        one.execute();
        LOGGER.info("from cache: " + one.isResponseFromCache());
        HelloCommand two = new HelloCommand(restTemplate, id);
        two.execute();
        LOGGER.info("from cache: " + two.isResponseFromCache());
        return "getUserById success";
    }

    @GetMapping("/getUser/{id}")
    public String getUser(@PathVariable Integer id) {
        helloService.getUserById(id);
        helloService.getUserById(id);
        return "getUser success";
    }

    @GetMapping("/getUserToCommandKey/{id}")
    public String getUserToCommandKey(@PathVariable Integer id) {
        helloService.getUserToCommandKey(id);
        helloService.getUserToCommandKey(id);
        return "getUserToCommand success";
    }

    @GetMapping("/getAndUpdateUser/{id}")
    public String getAndUpdate(@PathVariable Integer id) {
        helloService.getUserToCommandKey(id);
        helloService.getUserToCommandKey(id);
        helloService.updateUser(id);
        helloService.getUserToCommandKey(id);
        helloService.getUserToCommandKey(id);
        return "getAndUpdateUser success";
    }
}
