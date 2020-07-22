package com.company.inputandoutput;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = s.next();
        System.out.print("Enter Age: ");
        int age = s.nextInt();
        System.out.print("Enter Phone Number: ");
        int phone = s.nextInt();
        Person p = new Person(name,age,phone);
        p.getDetails();
    }
}
