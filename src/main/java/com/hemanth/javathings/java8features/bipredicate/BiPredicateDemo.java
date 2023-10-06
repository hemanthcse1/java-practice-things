package com.hemanth.javathings.java8features.bipredicate;

import com.hemanth.javathings.java8features.biconsumer.BiConsumerDemo;

import java.util.function.BiPredicate;

public class BiPredicateDemo implements BiPredicate<String, String> {


    @Override
    public boolean test(String s, String s2) {
        return s.equals(s2);
    }

    public static void main(String[] args) {


        BiPredicateDemo biPredicateDemo = new BiPredicateDemo();


        // traditional approach
        boolean test = biPredicateDemo.test("hemanth", "hemanth");

        System.out.println(test);


        System.out.println("------------------------------------------------");
        // anonymous approach
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };


        System.out.println("anonymouse check -> " + biPredicate.test("hemanth", "hemanth"));

        System.out.println("----------------------------------------------");
        // lambda approach
        BiPredicate<String, String> biPredicate1 = (s1, s2) -> s1.equals(s2);

        System.out.println(biPredicate1.test("hemanth", "hemanth"));
    }
}
