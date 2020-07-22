package com.company.inputandoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
//this is try with resources
public class StringRead {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new StringReader("Hello Arnold"));
                StringWriter writer = new StringWriter()
        ){
            writer.write(reader.readLine());
            System.out.println(writer.toString());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
