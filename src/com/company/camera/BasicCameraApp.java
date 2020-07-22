package com.company.camera;

public class BasicCameraApp extends PhoneCameraApp {
    String name ="Basic Camera ";

    BasicCameraApp(){
    }
    @Override
    void edit() {
        System.out.println("Edit pic using Basic Camera App");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
