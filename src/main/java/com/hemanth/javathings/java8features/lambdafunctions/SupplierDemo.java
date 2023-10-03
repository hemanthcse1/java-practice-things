package com.hemanth.javathings.java8features.lambdafunctions;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "It will return String ";
    }

    public static void main(String[] args) {

        Supplier<String> supplier = new SupplierDemo();

        System.out.println(supplier.get());
    }
}
