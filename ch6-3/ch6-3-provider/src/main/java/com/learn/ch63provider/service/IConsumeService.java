package com.learn.ch63provider.service;

import com.learn.ch63provider.service.impl.FallbackConsumeService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 20:45
 */
@FeignClient(name = "ch6-3-hello", fallback = FallbackConsumeService.class)
public interface IConsumeService {

    @GetMapping("/helloService")
    public String getHelloServiceData();

}
