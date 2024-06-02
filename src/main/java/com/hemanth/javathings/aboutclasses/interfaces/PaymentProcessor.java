package com.hemanth.javathings.aboutclasses.interfaces;

public interface PaymentProcessor {
    void pay(double amount);
    void refund(double amount);
    String generateReceipt();
}

