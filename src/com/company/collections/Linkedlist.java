package com.company.collections;
import java.util.LinkedList;
public class Linkedlist {
//linked list is good when your adding or removing many elements from a group of elements
//it also consumes more memory compaired to lists b'se each entry contains a reference to elements in a list
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("arnold");
        list.add("saidat");
        list.add("kafeero");
        list.add("sharp");
        list.add(1,"dallington");
        list.get(3);
        list.remove(0);
        System.out.println("My Friends are: "+list+" just "+list.size()+" of them");
        for (String a:list){
            System.out.println(a);
        }
    }
}
