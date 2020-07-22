package com.company.collections.queue;

public class Customer {
    private String name;
    private boolean served;

    Customer(String name){
        this.name = name;
        served = false;
    }
    public void serve(){
        served =true;
        System.out.println(name+" has been served");
    }

    @Override
    public String toString() {
        return name;
    }
}

