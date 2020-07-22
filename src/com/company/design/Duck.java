package com.company.design;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void Swim(){
        System.out.println("We ducks all swim");
    }
    void performFly(){
        flyBehavior.fly();
    }
    void performQuack(){
        quackBehavior.quack();
    }
    abstract void display();
}
