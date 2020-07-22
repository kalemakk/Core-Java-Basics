package com.company.file;

import java.io.*;

public class CreateFileExample {
    public static void main(String[] args) {
//        thats if your using debian .....ubuntu or kali linux or mint etc
        File myFile = new File("/home/arnoldkk/Desktop/myFile.txt");
        try{
           boolean fileCreated = myFile.createNewFile();
           System.out.println(fileCreated);
        }catch (IOException e){
            e.printStackTrace();
        }
        readFile();

    }
    static void readFile(){
        File myFile = new File("/home/arnoldkk/Desktop/myFile.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(myFile))
                ){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
