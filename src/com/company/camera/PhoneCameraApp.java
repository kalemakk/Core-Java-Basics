package com.company.camera;
//strategy pattern is used here
public abstract class PhoneCameraApp {
    Share share;
    void take(){
        System.out.println("Take a Pic");
    }
    abstract void edit();
    void save(){
        System.out.println("Save the Pic");
    }
    void sharePicture(){
        share.sharePicture();
    }

    public void setShare(Share share) {
        this.share = share;
    }
    abstract String getName();

//    public abstract void setName(String name);
}
