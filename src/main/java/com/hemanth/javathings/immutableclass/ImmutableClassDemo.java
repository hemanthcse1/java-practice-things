package com.hemanth.javathings.immutableclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableClassDemo {

    public static void main(String[] args) {


        Address address = new Address("HSR Layout", "Bangalore");
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("1234567890");
        phoneNumbers.add("0987654321");

        Map<String, String> metadata = new HashMap<>();
        metadata.put("company","Microsoft");
        metadata.put("designation","SDE");


        User user = new User("Hemanth","hemanthcse1@gmail.com",31,address,phoneNumbers,metadata);

        System.out.println(user);

        user.getPhoneNumbers().add("29374983749");

        System.out.println(user);

        user.getMetadata().put("State","Karnataka");

        System.out.println(user);
    }
}
