package com.hemanth.javathings.concreteclass;

public class PartTimeEmployee extends Employee implements Payable{
    private double salary;

    public PartTimeEmployee(int id, String name, double salary){
        super(name, id);
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working as part-time");
    }

    public void processPayment(){
        System.out.println("Payment is processed for "+getName());
    }
}
