package com.learn.ch101zuulserver.config;

import com.learn.ch101zuulserver.filter.AuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Ge Xiantao
 * @Date: 2019/6/4
 * @Time: 11:38
 */
@Configuration
public class FilterConfig {

    @Bean
    public AuthFilter authFilter() {
        return new AuthFilter();
    }
}
