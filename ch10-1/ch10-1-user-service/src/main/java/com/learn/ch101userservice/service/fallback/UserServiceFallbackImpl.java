package com.learn.ch101userservice.service.fallback;

import com.learn.ch101common.vo.User;
import com.learn.ch101userservice.service.dataservice.IDataService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/3
 * @Time: 19:22
 */
@Service
public class UserServiceFallbackImpl implements IDataService {


    @Override
    public User getDefaultUser() {
        return new User("0", "gavin");
    }

    @Override
    public String getContextUserId() {
        return "fallback userId: 0";
    }

    @Override
    public List<String> getProviderData() {
        ArrayList<String> data = new ArrayList<>();
        data.add("fallback list");
        return data;
    }
}
