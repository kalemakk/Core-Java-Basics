package com.company.adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
//        testDuck(duck);
        Drone drone = new SuperDrone();
        Duck duck1 = new DroneAdapter(drone);
        testDuck(duck1);

    }
    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
