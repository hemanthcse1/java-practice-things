package com.hemanth.javathings.aboutclasses.concreteclass;

public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id){
        this.id = id;
        this.name = name;
    }

    public abstract void work();

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
