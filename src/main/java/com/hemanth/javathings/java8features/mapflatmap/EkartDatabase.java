package com.hemanth.javathings.java8features.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "Hemanth", "hemanth@gmail.com", Arrays.asList("438473938", "937439473")),
                new Customer(102, "Sharad", "sharad@gmail.com", Arrays.asList("9483943489", "04039403904")),
                new Customer(103, "Rahul", "rahul@gmail.com", Arrays.asList("8943949349", "0940394043")),
                new Customer(104, "Kiran", "kiran@gmail.com", Arrays.asList("894389493", "0943940304903"))
        ).collect(Collectors.toList());
    }
}
