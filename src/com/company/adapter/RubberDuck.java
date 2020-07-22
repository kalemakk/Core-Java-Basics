package com.company.adapter;

public class RubberDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("we ducks fly");
    }
    @Override
    public void quack() {
        System.out.println("we do the quacking");
    }
}
