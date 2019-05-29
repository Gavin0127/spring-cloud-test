package com.learn.ch63hello.service;

import com.learn.ch63hello.service.impl.HelloFallbackServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 18:19
 */
@FeignClient(name = "ch6-3-hello-provider",
             fallback = HelloFallbackServiceImpl.class)
public interface IHelloService {

    @GetMapping("/getUser")
    String getUser(@RequestParam String userName);

    @GetMapping("/getDashboard")
    List<String> getDashboard();

}
