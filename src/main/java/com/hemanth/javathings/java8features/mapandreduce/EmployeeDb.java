package com.hemanth.javathings.java8features.mapandreduce;

import com.hemanth.javathings.java8features.stream.example.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeDb {

    public static List<Emp> getEmployees() {
        return Stream.of(new Emp(101, "hemanth", "A", 2100000),
                        new Emp(102, "Sharad", "A", 2200000),
                        new Emp(103, "rahul", "B", 1800000),
                        new Emp(104, "kiran", "C", 500000))
                .collect(Collectors.toList());
    }
}
