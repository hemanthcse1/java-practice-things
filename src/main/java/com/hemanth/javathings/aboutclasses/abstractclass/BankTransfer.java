package com.hemanth.javathings.aboutclasses.abstractclass;

public class BankTransfer  extends Payment{
    private String accountNumber;

    public BankTransfer(double amount, String accountNumber){
        super(amount);
        this.accountNumber = accountNumber;
    }

    public void processPayment(){
        System.out.println("Process payment of bank transfer of "+ getAmount() +" for account number "+accountNumber);
        printReceipt();
    }


    public void printReceipt(){
        // print receipt function
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
