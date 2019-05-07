package com.learn.ch45consumer.service;

import com.learn.ch45consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 15:02
 */
@FeignClient(name = "ch4-5-provider")
public interface UserFeignService {

    @RequestMapping(value = "user/add", method = RequestMethod.GET)
    String addUser(User user);

    @RequestMapping(value = "user/update", method = RequestMethod.POST)
    String updateUser(@RequestBody User user);

}
