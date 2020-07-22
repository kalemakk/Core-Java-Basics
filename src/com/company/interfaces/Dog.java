package com.company.interfaces;

public class Dog extends Cats implements Animal,Mammal {
    @Override
    public void move() {
        System.out.println("Dogs like to move");
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat Bones");
    }

    @Override
    public boolean isWarm() {
        return true;
    }

    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
        System.out.println("of course am warm blooded SIIKYO "+dog.isWarm());
        dog.isWarm();
        dog.move();
    }
}
