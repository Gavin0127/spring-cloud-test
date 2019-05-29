package com.learn.ch64collapsing.controller;

import com.learn.ch64collapsing.model.Animal;
import com.learn.ch64collapsing.service.ICollapsingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/10 17:07
 */
@RestController
public class CollapsingController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CollapsingController.class);

    @Autowired
    private ICollapsingService collapsingService;

    @GetMapping("/getAnimal")
    public String getAnimal() throws Exception {
        Future<Animal> animalFuture1 = collapsingService.collapsing(1);
        Future<Animal> animalFuture2 = collapsingService.collapsing(2);
        Future<Animal> animalFuture3 = collapsingService.collapsing(3);
        Animal animal1 = animalFuture1.get();
        Animal animal2 = animalFuture2.get();
        Animal animal3 = animalFuture3.get();
        LOGGER.info("ID: " + animal1.getId() + "NAME: " + animal1.getName());
        LOGGER.info("ID: " + animal2.getId() + "NAME: " + animal2.getName());
        LOGGER.info("ID: " + animal3.getId() + "NAME: " + animal3.getName());
        return "getAnimal SUCCESS";
    }

    @GetMapping("/getAnimalGlobal")
    public String getAnimalGlobal() throws Exception {
        Future<Animal> animalFuture1 = collapsingService.collapsingGlobal(1);
        Future<Animal> animalFuture2 = collapsingService.collapsingGlobal(2);
        Future<Animal> animalFuture3 = collapsingService.collapsingGlobal(3);
        Animal animal1 = animalFuture1.get();
        Animal animal2 = animalFuture2.get();
        Animal animal3 = animalFuture3.get();
        LOGGER.info("ID: " + animal1.getId() + "NAME: " + animal1.getName());
        LOGGER.info("ID: " + animal2.getId() + "NAME: " + animal2.getName());
        LOGGER.info("ID: " + animal3.getId() + "NAME: " + animal3.getName());
        return "getAnimal SUCCESS";
    }

}
