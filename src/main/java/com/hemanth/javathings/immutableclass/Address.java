package com.hemanth.javathings.immutableclass;

import lombok.Getter;


public class Address {
    private String street;
    private String city;


    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
