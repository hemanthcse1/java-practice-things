package com.hemanth.javathings.aboutclasses.abstractclass;

public class PaypalPayment extends Payment{
    private String email;

    public PaypalPayment(double amount, String email){
        super(amount);
        this.email = email;
    }

    public void processPayment(){
        System.out.println("Process PayPal payment of "+getAmount()+ " for account "+email);
        printReceipt();
    }

    public void printReceipt(){
        // print receipt functionality
    }

    public String getEmail(){
        return email;
    }
}
