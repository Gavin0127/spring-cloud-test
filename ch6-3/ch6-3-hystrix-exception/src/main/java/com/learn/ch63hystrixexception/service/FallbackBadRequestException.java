package com.learn.ch63hystrixexception.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.exception.HystrixBadRequestException;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/9 11:46
 */
public class FallbackBadRequestException extends HystrixCommand<String> {

    public FallbackBadRequestException() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupBRE"));
    }

    @Override
    protected String run() throws Exception {
        throw new HystrixBadRequestException(
                "HystrixBadRequestException error");
    }

    @Override
    protected String getFallback() {
        System.out.println(getFailedExecutionException().getMessage());
        return "invoke HystrixBadRequestException fallback method:  ";
    }


}
