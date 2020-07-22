package com.company.adapter;

public class DroneAdapter implements Duck{
    Drone drone;

    DroneAdapter(Drone drone){
        this.drone =drone;
    }

    @Override
    public void fly() {
        drone.spin_rotters();
        drone.take_off();
    }

    @Override
    public void quack() {
        drone.beep();
    }

}
