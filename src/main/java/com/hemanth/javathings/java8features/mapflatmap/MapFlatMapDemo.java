package com.hemanth.javathings.java8features.mapflatmap;

import com.hemanth.javathings.java8features.stream.example.EmployeeDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDemo {


    public static void main(String[] args) {


        List<Customer> customerList = EkartDatabase.getAll();

        // mapping logic converting customers and getting only emails of customer
        // one-to-one mapping
        List<String> customersEmails = customerList.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());

        // print the customers emails
        customersEmails.stream()
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");
        // get all the phone numbers

        List<List<String>> phoneNumbers = customerList.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());

        phoneNumbers.stream()
                .forEach(System.out::println);


        System.out.println("-----------------------------------------");

        List<String> phones = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        phones.stream()
                .forEach(System.out::println);


    }
}
