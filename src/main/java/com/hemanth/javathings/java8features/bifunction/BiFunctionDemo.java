package com.hemanth.javathings.java8features.bifunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionDemo implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {


    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 4, 7, 3, 8, 2, 12, 97, 13);
        List<Integer> list2 = Arrays.asList(1, 6, 5, 4, 9, 11, 10, 19, 24, 21);

        BiFunction biFunction = new BiFunctionDemo();

        System.out.println("Traditional approach " + biFunction.apply(list1, list2));

        System.out.println("------------------------------------------------------");


        // anonymous approach
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                return Stream.of(list1, list2)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(Collectors.toList());
            }
        };

        System.out.println("Anonymous approach -> " + biFunction1.apply(list1, list2));


        System.out.println("------------------------------------------------------");


        // using lambda expression

        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = (integers, integers2) -> {
            return Stream.of(list1, list2)
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
        };

        System.out.println("Using lambda approach -> " + biFunction2.apply(list1, list2));


        System.out.println("------------------------------------------------------");

        // real time scenario

        Map<String, Integer> map = new HashMap<>();
        map.put("hemanth", 5000);
        map.put("sharad", 12000);
        map.put("rahul", 15000);

        // approach one
     /*   BiFunction<String, Integer, Integer> increaseSalaryBiFunction = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String key, Integer value) {
                return value + 1000;
            }
        };
        map.replaceAll(increaseSalaryBiFunction);*/


        // approach two
      /*  BiFunction<String, Integer, Integer> increasLambda = (key, value) ->{
            return value +1500;
        };

        map.replaceAll(increasLambda);*/


        // approach three
      /*  BiFunction<String, Integer, Integer> increasLambda = (key, value) ->value +2000;

        map.replaceAll(increasLambda);*/


        // approach four
       /* map.replaceAll((key, value) -> value + 25000);

        System.out.println(map);*/


        // remove duplicate elements and sort the numbers from 2 lists

        BiFunction<List<Integer>, List<Integer>, List<Integer>> sortedList = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, List<Integer> integers2) {
                return Stream.of(list1, list2)
                        .flatMap(List::stream)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
            }
        };

        System.out.println("sorted -> " + sortedList.apply(list1, list2));

        System.out.println("---------------------------------------------------------------");

        BiFunction<List<Integer>, List<Integer>, List<Integer>> sortedLambda = (l1, l2) -> {
            return Stream.of(list1, list2)
                    .flatMap(List::stream)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
        };


        Function<List<Integer>, List<Integer>> sortedFunction = new Function<List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers) {
                return Stream.of(list1, list2)
                        .flatMap(List::stream)
                        .sorted()
                        .collect(Collectors.toList());
            }
        };

        // using andThen() from Function

        System.out.println("Sorted function -> " + biFunction2.andThen(sortedFunction).apply(list1, list2));


    }
}
