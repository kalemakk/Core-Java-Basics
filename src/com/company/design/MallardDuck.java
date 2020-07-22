package com.company.design;

public class MallardDuck extends Duck {
    MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
