package com.hemanth.javathings.java8features.lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUsingLambda {

    public static void main(String[] args) {

        Predicate<Integer> predicate = (i) -> {
            if (i % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        Predicate<Integer> newPredicate = (i) -> i % 2 == 0;
        System.out.println(newPredicate.test(6));


        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);

        lists.stream()
                .filter(t -> t % 2 == 0)
                .forEach(t -> System.out.println("Even numbers -> " + t));
    }
}
