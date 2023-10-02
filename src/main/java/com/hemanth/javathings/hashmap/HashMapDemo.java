package com.hemanth.javathings.hashmap;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap<String, Integer> impIDs = new HashMap<>();

        impIDs.put("Hemanth", 1);
        impIDs.put("Rahul", 2);
        impIDs.put("sharad", 3);


        System.out.println(impIDs);

        // case sensitive key
        impIDs.put("hemanth", 4);
        System.out.println(impIDs);

        // override value with existing key
        impIDs.put("hemanth", 5);
        System.out.println(impIDs);

        // return if key is present
        System.out.println(impIDs.containsKey("hemanth"));

        // return if value is present
        System.out.println(impIDs.containsValue(5));

        // replace
        impIDs.replace("hemanth", 6);
        System.out.println(impIDs);

        // replace function with new key
        impIDs.replace("kumar", 6);
        System.out.println(impIDs);

        // put if absent
        impIDs.putIfAbsent("kumar",7);
        System.out.println(impIDs);


    }
}
