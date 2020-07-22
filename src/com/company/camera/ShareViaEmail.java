package com.company.camera;

public class ShareViaEmail implements Share {
    @Override
    public void sharePicture() {
        System.out.println("Share pic via email address");
    }
}
