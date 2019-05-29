package com.learn.ch63hystrixexception.controller;

import com.learn.ch63hystrixexception.service.FallbackBadRequestException;
import com.learn.ch63hystrixexception.service.FallbackOtherException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/9 11:45
 */
@RestController
public class ExceptionController {

    @GetMapping("/badRequestException")
    public String badRequestException() {
        return new FallbackBadRequestException().execute();
    }

    @GetMapping("/otherException")
    public String otherException()
            throws ExecutionException, InterruptedException {
        Future<String> queue = new FallbackOtherException().queue();
        return queue.get();
    }

}
