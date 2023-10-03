package com.hemanth.javathings.java8features.stream.example;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static List<Employee> evaluateTaxUsers(String input) {

        return (input.equalsIgnoreCase("tax")) ?
                EmployeeDatabase.getAllEmployees().stream()
                        .filter(employee -> employee.getSalary() > 500000)
                        .collect(Collectors.toList())
                : EmployeeDatabase.getAllEmployees().stream()
                .filter(employee -> employee.getSalary() <= 500000)
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("tax"));
    }


}
