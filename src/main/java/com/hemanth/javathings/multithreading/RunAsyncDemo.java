package com.hemanth.javathings.multithreading;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hemanth.javathings.java8features.stream.example.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAsyncDemo {

    public Void saveEmployees(File jsonFile) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ObjectMapper mapper = new ObjectMapper();

        // traditional approach
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    List<SampleEmployee> employees = mapper.readValue(jsonFile, new TypeReference<List<SampleEmployee>>() {
                    });

                    System.out.println("Thread name -> " + Thread.currentThread().getName());
                    employees.stream()
                            .forEach(System.out::println);


                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }, executorService);


        return voidCompletableFuture.get();
    }

    public Void saveEmployeesWithLambda(File jsonFile) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ObjectMapper mapper = new ObjectMapper();

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            try {
                List<SampleEmployee> sampleEmployees = mapper.readValue(jsonFile, new TypeReference<List<SampleEmployee>>() {
                });

                System.out.println("Thread name -> " + Thread.currentThread().getName());
                sampleEmployees.stream()
                        .forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }, executorService);


        return voidCompletableFuture.get();
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RunAsyncDemo runAsyncDemo = new RunAsyncDemo();

      //  runAsyncDemo.saveEmployees(new File("employees.json"));

        runAsyncDemo.saveEmployeesWithLambda(new File("employees.json"));
    }


}
