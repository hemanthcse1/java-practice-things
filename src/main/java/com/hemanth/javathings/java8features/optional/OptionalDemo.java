package com.hemanth.javathings.java8features.optional;

import com.hemanth.javathings.java8features.mapflatmap.Customer;
import com.hemanth.javathings.java8features.mapflatmap.EkartDatabase;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String emailId) throws Exception {
        return EkartDatabase.getAll().stream()
                .filter(customer -> customer.getEmail().equals(emailId))
                .findAny()
                .orElseThrow(() -> new Exception("No Cusomer  present with this email id"));
    }

    public static void main(String[] args) throws Exception {

        // keep any one field null to know more about NullPointerException conditions

          Customer customer = new Customer(101, "Hemanth", null, Arrays.asList("945789437473", "9849374374837"));
        // Customer customer = new Customer(101, "Hemanth", "hemanth@gmail.com", Arrays.asList("945789437473", "9849374374837"));


        // empty
        // of
        // ofNullable


        Optional<Object> optionalOne = Optional.empty();

        System.out.println(optionalOne);


        /*Optional<String> optionalTwo = Optional.of(customer.getEmail());
        System.out.println(optionalTwo);*/


        Optional<String> optionalThree = Optional.ofNullable(customer.getEmail());
        //  System.out.println(optionalThree.orElse("default@gmail.com")); // if field is null return default mail id or text

        // it throws the exception
        // System.out.println(optionalThree.orElseThrow(() -> new IllegalArgumentException("No email present/its a null field")));

        if (optionalThree.isPresent()) {
            System.out.println(optionalThree.get());
        }

        // using method reference
        optionalThree.ifPresent(System.out::println);

        System.out.println(optionalThree.map(String::toUpperCase).orElseGet(() -> "default@email.com"));

        // using filter
        System.out.println(getCustomerByEmailId("pqr@gmail.com"));

    }
}
