package com.hemanth.javathings.java8features.stream.example;

import java.util.ArrayList;
import java.util.List;

// this is a DAO layer
public class EmployeeDatabase {

    public static List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Hemanth", "SDE", 2100000));
        list.add(new Employee(102, "Sharad", "Marketing", 2400000));
        list.add(new Employee(103, "Rahul", "Manager", 2500000));
        list.add(new Employee(104, "Maroof", "SDE", 500000));
        list.add(new Employee(105, "Karthik", "UI/UX", 400000));
        return list;

    }
}
