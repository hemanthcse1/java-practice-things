package com.hemanth.javathings.java8features.lambdafunctions;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<Integer> {


    @Override
    public void accept(Integer integer) {
        System.out.println("Print the value " + integer);
    }

    public static void main(String[] args) {


        Consumer<Integer> consumer = new ConsumerDemo();

        consumer.accept(25);
    }
}
