package com.learn.ch63hystrixexception.service;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/9 12:04
 */
public class FallbackOtherException extends HystrixCommand<String> {

    public FallbackOtherException() {
        super(HystrixCommandGroupKey.Factory.asKey("groupOE"));
    }

    @Override
    protected String run() throws Exception {
        throw new Exception("this command will trigger fallback");
    }

    @Override
    protected String getFallback() {
        return "invoke FallbackOtherExpcetion fallback method";
    }
}
