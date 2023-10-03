package com.hemanth.javathings.java8features.lambdafunctions;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        if (integer%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {


        Predicate<Integer> predicate = new PredicateDemo();
        System.out.println(predicate.test(24));


    }
}
