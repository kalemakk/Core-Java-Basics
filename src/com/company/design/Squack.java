package com.company.design;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I only Squack");
    }
}
