package com.learn.ch101userservice.service.impl;

import com.learn.ch101common.vo.User;
import com.learn.ch101userservice.service.IUserService;
import com.learn.ch101userservice.service.dataservice.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/21 18:22
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IDataService dataService;

    @Override
    public User getDefaultUser() {
        return dataService.getDefaultUser();
    }

    @Override
    public String getContextUserId() {
        return dataService.getContextUserId();
    }

    @Override
    public List<String> getProviderData() {
        return dataService.getProviderData();
    }

}
