package com.hemanth.javathings.aboutclasses.concreteclass;

public class FullTimeEmployee extends Employee implements Payable, Trackable{
    private double salary;

    public FullTimeEmployee(int id, String name, double salary){
        super(name,id);
        this.salary = salary;
    }

    @Override
    public void work(){
        System.out.println(getName() + " is working full time");
    }

    @Override
    public void processPayment(){
        System.out.println("Payment is processing for "+getName());
    }

    @Override
    public void longHours(int hours){
        System.out.println(getName() +" logged "+ hours +" hours");
    }
}
