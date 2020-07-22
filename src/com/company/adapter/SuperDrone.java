package com.company.adapter;

public class SuperDrone implements Drone {
    @Override
    public void beep() {
        System.out.println("we beep");

    }

    @Override
    public void spin_rotters() {
        System.out.println("we not fly we rotate");
    }

    @Override
    public void take_off() {
        System.out.println("we dont swim but run fast");
    }
}
