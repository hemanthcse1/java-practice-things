package com.hemanth.javathings.java8features.lambdafunctions;

import java.util.SortedMap;
import java.util.function.Consumer;

public class ConsumerUsingLambda {

    // here Consumer<Integer> Functional interface is written using lambda function

    public static void main(String[] args) {

        Consumer<Integer> consumer = (t) -> System.out.println(t);
        consumer.accept(25);


    }
}
