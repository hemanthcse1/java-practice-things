package com.hemanth.javathings.aboutclasses.abstractclass;

public abstract class Payment {
    private double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public abstract void processPayment();

    public void printReceipt(){
        System.out.println("Payment of "+ amount + " is processed");
    }

    public double getAmount(){
        return amount;
    }
}
