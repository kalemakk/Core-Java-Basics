package com.company.camera;

public class CameraPlusApp extends PhoneCameraApp{
    public String name ="Camera Plus ";
    CameraPlusApp(){
    }
    @Override
    void edit() {
        System.out.println("Edit pic using Camera plus app");
    }

    @Override
    public String getName() {
        return name;
    }
}
