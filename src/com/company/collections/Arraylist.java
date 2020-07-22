package com.company.collections;
import java.util.ArrayList;

//faster when it comes to retrieving elements from the elements array
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> even_numbers = new ArrayList<>();
        even_numbers.add(12);
        even_numbers.add(34);
        even_numbers.add(30);
        even_numbers.add(45);
        System.out.println(even_numbers);
        System.out.println(even_numbers.get(2));
    }
}
