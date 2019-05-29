package com.learn.ch82zuulserver.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Ge Xiantao
 * @date : 2019/5/21 10:27
 */
public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        Apple.filterApples(inventory,
                           (Apple a) -> "green".equals(a.getColour()));
        Apple.filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        Stream<Apple> filteredApple =
                inventory.stream().filter((Apple a) -> a.getWeight() > 150);
        List<Apple> collect = filteredApple.collect(Collectors.toList());
        List<Apple> apples = inventory.parallelStream()
                                      .filter((Apple a) -> a.getWeight() >
                                                           100)
                                      .collect(Collectors.toList());
        inventory.sort(Comparator.comparing(Apple::getWeight));

    }

}
