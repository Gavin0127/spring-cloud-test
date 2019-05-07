package com.learn.book.service;

import com.learn.book.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/6 17:43
 */
@FeignClient(name = "github-client", url = "https://api.github.com",
             configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {

    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    String searchRepo(@RequestParam("q") String queryStr);

}
