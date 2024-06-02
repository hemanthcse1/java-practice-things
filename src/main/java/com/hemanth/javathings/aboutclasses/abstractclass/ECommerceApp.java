package com.hemanth.javathings.aboutclasses.abstractclass;

public class ECommerceApp {

    public static void main(String[] args){

        Payment creditCardPayment = new CreditCardPayment(100,"1234-5678-9123");
        Payment paypalPayment = new PaypalPayment(150,"hemanthcse1@gmail.com");
        Payment bankTransferPayment = new BankTransfer(200,"123456789");


        creditCardPayment.processPayment();

        paypalPayment.processPayment();

        bankTransferPayment.processPayment();
    }
}
