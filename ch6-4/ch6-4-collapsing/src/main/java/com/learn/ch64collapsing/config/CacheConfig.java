package com.learn.ch64collapsing.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 17:10
 */
@Configuration
public class CacheConfig {

    @Bean
    public CacheRequestInterceptor cacheRequestInteceptor() {
        return new CacheRequestInterceptor();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
