package com.hemanth.javathings.java8features.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Hemanth");
        list.add("Rahul");
        list.add("Sharad");
        list.add("Maroof");
        list.add("Kiran");

        // traditional way of foreach method
        for (String s : list) {
            System.out.println(s);
        }


        System.out.println("************************");
        // using stream and lambda expression
        list.stream()
                .forEach(s -> System.out.println(s));

        System.out.println("----------------------");

        // using method reference
        list.stream()
                .forEach(System.out::println);

        System.out.println("*******************");
        // streaming map function

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        // using traditional way
        map.forEach((key, value) -> System.out.println(key + "   " + value));

        System.out.println("----------------------");
        //using stream
        map.entrySet().stream()
                .forEach(System.out::println);

        System.out.println("***************************************************");

        // Using predicate for filter function with stream
        list.stream()
                .filter(t -> t.startsWith("S"))
                .forEach(s -> System.out.println(s));

        // it will give the result for even keys
        map.entrySet().stream()
                .filter(k -> k.getKey() % 2 == 0)
                .forEach(s -> System.out.println(s.getValue()));

    }
}
