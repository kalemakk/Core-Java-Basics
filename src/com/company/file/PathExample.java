package com.company.file;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("/home/arnoldkk/Desktop/myFile.txt");
        System.out.println(".........................................................");
        System.out.println(path.getFileSystem());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());
    }
}
