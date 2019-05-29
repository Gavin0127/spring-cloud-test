package com.learn.ch82zuulserver.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/21 10:21
 */
public class Apple {

    private String colour;

    private Integer weight;

    public Apple(String colour, Integer weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColour());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    public static List<Apple> filterApples(List<Apple> inventory,
                                           Predicate<Apple> predicate) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
