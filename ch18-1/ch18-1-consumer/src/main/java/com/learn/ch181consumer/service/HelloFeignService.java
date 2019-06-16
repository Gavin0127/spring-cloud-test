package com.learn.ch181consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/12
 * @Time: 20:14
 */
@FeignClient(name = "ch18-1-provider")
public interface HelloFeignService {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);

}
