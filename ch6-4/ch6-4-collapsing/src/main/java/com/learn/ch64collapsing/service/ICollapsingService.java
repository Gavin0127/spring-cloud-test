package com.learn.ch64collapsing.service;

import com.learn.ch64collapsing.model.Animal;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import java.util.List;
import java.util.concurrent.Future;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 17:12
 */
public interface ICollapsingService {
    @HystrixCollapser(batchMethod = "collapsingList", collapserProperties =
            {@HystrixProperty(name = "timerDelayInMilliseconds", value =
                    "1000")})
    Future<Animal> collapsing(Integer id);

    @HystrixCollapser(batchMethod = "collapsingList", scope =
            com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL,
                      collapserProperties =
                              {@HystrixProperty(
                                      name = "timerDelayInMilliseconds", value =
                                      "1000")})
    Future<Animal> collapsingGlobal(Integer id);

    @HystrixCommand
    List<Animal> collapsingList(List<Integer> animalIds);
}
