package com.learn.ch101userservice.service.dataservice;

import com.learn.ch101common.vo.User;
import com.learn.ch101userservice.service.fallback.UserServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/21 20:54
 */
@FeignClient(name = "ch10-1-data-service", fallback = UserServiceFallbackImpl.class)
public interface IDataService {

    @GetMapping("/getDefaultUser")
    User getDefaultUser();

    @GetMapping("/getContextUserId")
    String getContextUserId();

    @GetMapping("/getProviderData")
    List<String> getProviderData();

}
