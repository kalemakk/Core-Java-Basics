package com.company.file;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        File myDirectory = new File("/home/arnoldkk/Desktop/myFile");
        boolean madeDirectory = myDirectory.mkdir();
        System.out.println(madeDirectory);
    }
}
