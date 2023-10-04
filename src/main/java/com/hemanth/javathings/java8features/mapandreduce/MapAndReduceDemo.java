package com.hemanth.javathings.java8features.mapandreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapAndReduceDemo {

    /*
     * map -> data transformation
     * reduce -> Aggregating data
     *
     *
     * */

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 3, 6, 3, 7, 8, 9); // sum -> 37

        List<String> words = Arrays.asList("hemanth", "sharad", "rahul");

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);


        // using stream or functional programming
        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        // using reduce
        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> methodReferenceReduce = numbers.stream().reduce(Integer::sum);
        System.out.println(methodReferenceReduce.get());

        // find multiplication
        Integer multiplicationResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiplicationResult);

        // find max using reduce
        Integer maxValueUsingTernary = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValueUsingTernary);

        // find max using method reference
        Optional<Integer> usingMethodReference = numbers.stream().reduce(Integer::max);
        System.out.println(usingMethodReference.get());


        String longestWords = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestWords);


    }
}
