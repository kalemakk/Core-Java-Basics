package com.company.design;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I only Quack");
    }
}
