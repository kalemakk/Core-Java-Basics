package com.company.inputandoutput;

import javax.xml.namespace.QName;

public class Person {
    private String name;
    private int age;
    private int phoneNumber;

    Person(String name,int age, int phoneNumber){
        this.name =name;
        this.age = age;
        this.phoneNumber =phoneNumber;
    }

     void getDetails(){
        System.out.println("Name is :"+ name);
        System.out.println("Age is :"+ age);
        System.out.println("Phone Number is :"+ phoneNumber);
     }
}
