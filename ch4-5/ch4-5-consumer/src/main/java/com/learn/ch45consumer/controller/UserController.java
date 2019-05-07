package com.learn.ch45consumer.controller;

import com.learn.ch45consumer.model.User;
import com.learn.ch45consumer.service.UserFeignService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 15:01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody @ApiParam(name = "用户", value = "传入json" +
                                                                      "格式",
                                                 required = true) User user) {
        return userFeignService.addUser(user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(
            @RequestBody @ApiParam(name = "用户", value = "传入json" +
                                                        "格式",
                                   required = true) User user) {
        return userFeignService.updateUser(user);
    }

}
