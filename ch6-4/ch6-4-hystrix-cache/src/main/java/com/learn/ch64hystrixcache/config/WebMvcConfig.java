package com.learn.ch64hystrixcache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 15:45
 */
@Configuration
@ConditionalOnClass(Controller.class)
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private CacheContextInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
