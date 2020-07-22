package com.company.camera;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BasicCameraApp basicCameraApp = new BasicCameraApp();
        basicCameraApp.setShare(new ShareViaText());
        CameraPlusApp cameraPlusApp = new CameraPlusApp();
        cameraPlusApp.setShare(new ShareViaSocialMedia());
//use a list just for fun .....by arnoldkk the best java developer in EastAfrica
        List<PhoneCameraApp> cameras = new ArrayList<>();
        cameras.add(basicCameraApp);
        cameras.add(cameraPlusApp);
        System.out.println("...........................Cameras..............................");
        for (PhoneCameraApp cmo:cameras){
            System.out.println("My Name is: "+cmo.getName());
            System.out.print("I edit Using: ");
            cmo.edit();
            cmo.save();
            cmo.take();
            cmo.setShare(new ShareViaSocialMedia());
            cmo.sharePicture();
            System.out.println();

        }

    }
}
