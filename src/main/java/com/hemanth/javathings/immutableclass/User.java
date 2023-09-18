package com.hemanth.javathings.immutableclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


final public class User {

    private final String userName;
    private final String email;
    private final  int age;
    private final Address address;
    private final List<String> phoneNumbers;
    private final Map<String,String> metadata;

    public User(String userName, String email, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata) {
        this.userName = userName;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.metadata = metadata;
    }


    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }


    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }

    public Address getAddress() throws CloneNotSupportedException{
        return (Address) address.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", metadata=" + metadata +
                '}';
    }
}
