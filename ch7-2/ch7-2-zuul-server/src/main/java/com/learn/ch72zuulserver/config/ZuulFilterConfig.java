package com.learn.ch72zuulserver.config;

import com.learn.ch72zuulserver.filter.FirstPreFilter;
import com.learn.ch72zuulserver.filter.PostFilter;
import com.learn.ch72zuulserver.filter.SecondPreFilter;
import com.learn.ch72zuulserver.filter.ThirdPreFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/15 15:50
 */
@Configuration
public class ZuulFilterConfig {

    @Bean
    public FirstPreFilter firstPreFilter() {
        return new FirstPreFilter();
    }

    @Bean
    public SecondPreFilter secondPreFilter() {
        return new SecondPreFilter();
    }

    @Bean
    public ThirdPreFilter thirdPreFilter() {
        return new ThirdPreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

}
