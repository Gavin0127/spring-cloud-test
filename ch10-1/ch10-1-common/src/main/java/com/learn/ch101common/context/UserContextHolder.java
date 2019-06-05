package com.learn.ch101common.context;

import com.learn.ch101common.vo.User;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/4
 * @Time: 11:07
 */
public class UserContextHolder {

    private static ThreadLocal<User> local = new ThreadLocal<>();

    public static User currentUser() {
        return local.get();
    }

    public static void set(User user) {
        local.set(user);
    }

    public static void remove() {
        local.remove();
    }

}
