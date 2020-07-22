package com.company.file;
import java.io.File;
import java.io.FilenameFilter;
public class ListFiles {
    public static void main(String[] args) {
        FilenameFilter filter = (file,fileName)-> fileName.contains(".");
        FilenameFilter filter1 = (file,fileName)-> fileName.startsWith("my");

        System.out.println("............................................................................");
        System.out.println(filter);
        System.out.println("............................................................................");

        String[] contents = new File("/home/arnoldkk/Desktop").list(filter1);

        if (contents != null) {
            for (String name:contents){
                    System.out.println(name);
            }
        }
    }
}

