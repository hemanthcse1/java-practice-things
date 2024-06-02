package com.hemanth.javathings.aboutclasses.concreteclass;

public class Company {

    public static void main(String[] args){


        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101,"Hemanth Kumar",120000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Santhosh",80000);

        fullTimeEmployee.longHours(160);
        fullTimeEmployee.work();
        fullTimeEmployee.processPayment();

        partTimeEmployee.work();
        partTimeEmployee.processPayment();
    }
}
