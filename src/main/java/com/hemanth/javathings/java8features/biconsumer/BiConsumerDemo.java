package com.hemanth.javathings.java8features.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.IntConsumer;

public class BiConsumerDemo implements BiConsumer<String, Integer> {
    @Override
    public void accept(String s, Integer integer) {
        System.out.println("input 1 " + s + " input 2 " + integer);
    }

    public static void main(String[] args) {


        BiConsumerDemo biConsumerDemo = new BiConsumerDemo();


        biConsumerDemo.accept("helloworld", 2500);


        System.out.println("----------------------------------");
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("input 1 : " + s + "  input 2 " + integer);
            }
        };

        biConsumer.accept("hemanth", 123445);


        System.out.println("----------------------------------");
        // lambda approach

        BiConsumer<String, Integer> biConsumer1 = (s, i) -> {
            System.out.println("input s " + s + " input 2 " + i);
        };


        biConsumer1.accept("hemanth", 33334);



        System.out.println("----------------------------------");


        Map<String,Integer> map = new HashMap<>();

        map.put("hemanth",1000);
        map.put("sharad",2000);
        map.put("rahul",3000);

        map.forEach((s,i)->{
            System.out.println("map key "+s+" map value "+i);
        });

        System.out.println(map);


    }
}
