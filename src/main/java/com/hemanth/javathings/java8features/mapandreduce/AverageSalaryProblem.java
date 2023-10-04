package com.hemanth.javathings.java8features.mapandreduce;

public class AverageSalaryProblem {

    public static void main(String[] args) {

        // find the average salary of the employees whos grade is "A"
        double averageSalary = EmployeeDb.getEmployees().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();


        System.out.println("Average salary -> "+averageSalary);


        // find the sum of salary whos grade is "A"
        double sumOfSalary = EmployeeDb.getEmployees().stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(emp -> emp.getSalary())
                .mapToDouble(i -> i)
                .sum();

        System.out.println("Sum of salary -> "+sumOfSalary);

    }
}
