package com.hemanth.javathings.java8features.lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierUsingLambda {

    public static void main(String[] args) {


        Supplier<String> supplier = () -> "Supplier using lambda function";

        System.out.println(supplier.get());

        List<String> lists = Arrays.asList("1", "2", "3", "4", "5");
        List<String> listss = Arrays.asList();

        String result = listss.stream()
                .findAny()
                .orElseGet(() -> "not found any value ");

        System.out.println(result);
    }
}
