package com.hemanth.javathings.java8features.parallelstreams;

import com.hemanth.javathings.java8features.stream.example.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            employees.add(new Employee(i, "employee" + i, "A", (double) new Random().nextInt(1000 * 100)));
        }
        return employees;
    }

    public static void main(String[] args) {
        long start = 0;
        long end = 0;

    /*    start = System.currentTimeMillis();
        IntStream.range(1, 100)
                .forEach(System.out::println);
        end = System.currentTimeMillis();


        System.out.println("Plain Stream took time : " + (end - start));

        System.out.println("-------------------------------------------------");

        start = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();


        System.out.println("Parallel stream took time : " + (end - start));*/

/*
        IntStream.range(1, 10)
                .forEach(x -> {
                    System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
                });

        System.out.println("================================");

        IntStream.range(1, 10).parallel()
                .forEach(x -> {
                    System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
                });*/


        List<Employee> employees = getEmployees();

        start = System.currentTimeMillis();
        double averageSalary = getEmployees().stream()
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("average salary "+averageSalary);
        System.out.println("Plain Stream time :" + (end - start));


        System.out.println("-------------------------");

        start = System.currentTimeMillis();
        double averageSalaryParallel = getEmployees().parallelStream()
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("average salary "+averageSalaryParallel);
        System.out.println("Parallel Stream time : " + (end - start));



    }
}
