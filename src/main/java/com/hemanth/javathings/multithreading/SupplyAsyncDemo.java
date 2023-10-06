package com.hemanth.javathings.multithreading;

import com.hemanth.javathings.multithreading.database.EmployeeDatabase;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {
/*

    public static List<SampleEmployee> getEmployees() throws ExecutionException, InterruptedException {
        CompletableFuture<List<SampleEmployee>> listCompletableFuture = CompletableFuture.supplyAsync(() -> {
            return EmployeeDatabase.fetchEmployees();
        });
        return listCompletableFuture.get();
    }

*/

    public static List<SampleEmployee> getEmployees() throws ExecutionException, InterruptedException {

        Executor executor = Executors.newFixedThreadPool(10);
        CompletableFuture<List<SampleEmployee>> listCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Executed by -> " + Thread.currentThread().getName());
            return EmployeeDatabase.fetchEmployees();
        },executor);
        return listCompletableFuture.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        List<SampleEmployee> employees = getEmployees();

        employees.stream()
                .forEach(System.out::println);
    }

}
