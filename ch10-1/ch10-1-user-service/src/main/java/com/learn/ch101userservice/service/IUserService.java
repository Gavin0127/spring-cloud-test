package com.learn.ch101userservice.service;

import com.learn.ch101common.vo.User;

import java.util.List;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/21 18:22
 */
public interface IUserService {
    User getDefaultUser();

    String getContextUserId();

    List<String> getProviderData();
}
