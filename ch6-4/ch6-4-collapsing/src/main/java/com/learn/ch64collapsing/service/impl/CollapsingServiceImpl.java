package com.learn.ch64collapsing.service.impl;

import com.learn.ch64collapsing.model.Animal;
import com.learn.ch64collapsing.service.ICollapsingService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 17:12
 */
@Component
public class CollapsingServiceImpl implements ICollapsingService {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CollapsingServiceImpl.class);

    @HystrixCollapser(batchMethod = "collapsingList", collapserProperties =
            {@HystrixProperty(name = "timerDelayInMilliseconds", value =
                    "1000")})
    @Override
    public Future<Animal> collapsing(Integer id) {
        return null;
    }

    @HystrixCollapser(batchMethod = "collapsingList", scope =
            com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL,
                      collapserProperties =
                              {@HystrixProperty(
                                      name = "timerDelayInMilliseconds", value =
                                      "5000")})
    @Override
    public Future<Animal> collapsingGlobal(Integer id) {
        return null;
    }

    @Override
    @HystrixCommand
    public List<Animal> collapsingList(List<Integer> animalIds) {
        LOGGER.info("collapsingList当前线程" + Thread.currentThread().getName());
        LOGGER.info("当前请求参数个数" + animalIds.size());
        List<Animal> animals = new ArrayList<>();
        for (Integer animalId : animalIds) {
            Animal animal = new Animal();
            animal.setId(animalId);
            animal.setName("Cat");
            animals.add(animal);
        }
        return animals;
    }

}
