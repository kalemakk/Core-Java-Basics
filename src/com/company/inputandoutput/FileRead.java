package com.company.inputandoutput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
    public static void main(String[] args) {
        File f = new File("hello.html");
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;
            while ((line =reader.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
