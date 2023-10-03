package com.hemanth.javathings.java8features.maps;

import com.hemanth.javathings.java8features.stream.example.Employee;

import java.util.*;
import java.util.Map.Entry;

public class SortMapDemo {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());


        System.out.println("----------------------------");

        // traditional way
        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }


        System.out.println("----------------------------");
        // using lambda expression

        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));


        for (Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        System.out.println("----------------------------");

        // using stream api comparing by key
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);


        System.out.println("----------------------------");

        // comparing with by value
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


        System.out.println("----------------------------");

        // traditional way

        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });
        employeeMap.put(new Employee(101, "Hemanth", "SDE", 2100000), 6);
        employeeMap.put(new Employee(102, "Sharad", "Marketing", 2400000), 5);
        employeeMap.put(new Employee(103, "Rahul", "Manager", 2500000), 9);
        employeeMap.put(new Employee(104, "Maroof", "SDE", 500000), 4);
        employeeMap.put(new Employee(105, "Karthik", "UI/UX", 400000), 7);


        System.out.println(employeeMap);

        System.out.println("----------------------------");
        // using lambda

        Map<Employee, Integer> employeeMapSort = new TreeMap<>(
                (o1, o2) -> {
                    return (int) (o2.getSalary() - o1.getSalary());
                }
        );

        employeeMapSort.put(new Employee(101, "Hemanth", "SDE", 2100000), 6);
        employeeMapSort.put(new Employee(102, "Sharad", "Marketing", 2400000), 5);
        employeeMapSort.put(new Employee(103, "Rahul", "Manager", 2500000), 9);
        employeeMapSort.put(new Employee(104, "Maroof", "SDE", 500000), 4);
        employeeMapSort.put(new Employee(105, "Karthik", "UI/UX", 400000), 7);

        System.out.println(employeeMapSort);

        System.out.println("----------------------------");

        // using stream

        Map<Employee, Integer> employeeMapStream = new TreeMap<>();
        employeeMapStream.put(new Employee(101, "Hemanth", "SDE", 2100000), 6);
        employeeMapStream.put(new Employee(102, "Sharad", "Marketing", 2400000), 5);
        employeeMapStream.put(new Employee(103, "Rahul", "Manager", 2500000), 9);
        employeeMapStream.put(new Employee(104, "Maroof", "SDE", 500000), 4);
        employeeMapStream.put(new Employee(105, "Karthik", "UI/UX", 400000), 7);

        employeeMapStream.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);


    }
}
