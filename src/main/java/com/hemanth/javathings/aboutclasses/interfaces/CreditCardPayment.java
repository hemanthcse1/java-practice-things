package com.hemanth.javathings.aboutclasses.interfaces;

public class CreditCardPayment implements PaymentProcessor {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // Logic for processing credit card payment
        System.out.println("Processing credit card payment of $" + amount + " for card " + cardNumber);
    }

    @Override
    public void refund(double amount) {
        // Logic for refunding credit card payment
        System.out.println("Refunding $" + amount + " to credit card " + cardNumber);
    }

    @Override
    public String generateReceipt() {
        // Logic for generating receipt
        return "Receipt for credit card payment to card " + cardNumber;
    }
}

