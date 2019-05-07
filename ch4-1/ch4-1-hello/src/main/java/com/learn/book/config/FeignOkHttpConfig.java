package com.learn.book.config;

import feign.Feign;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/7 11:34
 */
@Configuration
@ConditionalOnClass(Feign.class)
@AutoConfigureBefore(FeignAutoConfiguration.class)
public class FeignOkHttpConfig {

    public OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
                                         .readTimeout(60, TimeUnit.SECONDS)
                                         .writeTimeout(60, TimeUnit.SECONDS)
                                         .retryOnConnectionFailure(true)
                                         .connectionPool(new ConnectionPool())
                                         .build();
    }

}
