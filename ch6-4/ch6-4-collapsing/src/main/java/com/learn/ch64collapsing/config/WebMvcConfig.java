package com.learn.ch64collapsing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 17:09
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private CacheRequestInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
