package com.learn.feign.controller;

import com.learn.feign.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 11:08
 */
@RestController
public class HelloController {

    @Autowired
    private HelloFeignService helloFeignService;

    @GetMapping(path = "/search/github")
    public ResponseEntity<byte[]> searchRepo(
            @RequestParam("str") String queryStr) {
        return helloFeignService.searchRepo(queryStr);
    }

}
