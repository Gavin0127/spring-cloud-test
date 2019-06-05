package com.learn.ch101common.interceptor;

import cn.hutool.core.util.StrUtil;
import com.learn.ch101common.context.UserContextHolder;
import com.learn.ch101common.util.HttpConvertUtil;
import com.learn.ch101common.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/3
 * @Time: 23:18
 */
@Slf4j
public class UserContextInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = new User(HttpConvertUtil.requestToMap(request));
        if (StrUtil.isBlank(user.getUserId())) {
            log.error("user context is null");
            return false;
        }
        UserContextHolder.set(user);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {
        UserContextHolder.remove();
    }
}
