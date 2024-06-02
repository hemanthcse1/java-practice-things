package com.hemanth.javathings.aboutclasses.abstractclass;

public class CreditCardPayment extends Payment{
    public String cardNumber;

    public CreditCardPayment(double amount,String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    public void processPayment(){
        System.out.println("Process credit card payment of "+ getAmount() +" for card Number "+cardNumber);
        printReceipt();
    }

    public void printReceipt(){
        // print receipt function
    }

    public String getCardNumber(){
        return cardNumber;
    }
}
