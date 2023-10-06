package com.hemanth.javathings.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class ExamplesDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> futures = service.submit(() -> {
            // delay(5000);
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        });

        List<Integer> list = futures.get();

        list.forEach(System.out::println);


        // no return value
      /*  CompletableFuture.runAsync(Runnable); //forkJoinPool
        CompletableFuture.runAsync(Runnable, Executor); // Custom Executor*/


        // returns value
      /*  CompletableFuture.supplyAsync(Supplier < T >);
        CompletableFuture.supplyAsync(Supplier < T >, Executor);*/


    }

    private static void delay(long time) {
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
