package com.learn.ch63provider.service.impl;

import com.learn.ch63provider.service.IConsumeService;
import org.springframework.stereotype.Component;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/8 21:40
 */
@Component
public class FallbackConsumeService implements IConsumeService {
    @Override
    public String getHelloServiceData() {
        return "hehe";
    }
}
