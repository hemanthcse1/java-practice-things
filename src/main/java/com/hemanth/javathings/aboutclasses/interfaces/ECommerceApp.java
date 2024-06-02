package com.hemanth.javathings.aboutclasses.interfaces;

public class ECommerceApp {
    public static void main(String[] args) {
        PaymentProcessor creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentProcessor payPalPayment = new PayPalPayment("user@example.com");
        PaymentProcessor bankTransferPayment = new BankTransferPayment("9876543210");

        // Process payments
        creditCardPayment.pay(100.0);
        payPalPayment.pay(200.0);
        bankTransferPayment.pay(300.0);

        // Refund payments
        creditCardPayment.refund(50.0);
        payPalPayment.refund(100.0);
        bankTransferPayment.refund(150.0);

        // Generate receipts
        System.out.println(creditCardPayment.generateReceipt());
        System.out.println(payPalPayment.generateReceipt());
        System.out.println(bankTransferPayment.generateReceipt());
    }
}

