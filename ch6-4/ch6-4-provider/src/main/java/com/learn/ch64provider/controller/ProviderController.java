package com.learn.ch64provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 15:30
 */
@RestController
public class ProviderController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable int id) {
        LOGGER.info("receive request,id: " + id);
        return "gavin: " + id;
    }

}
