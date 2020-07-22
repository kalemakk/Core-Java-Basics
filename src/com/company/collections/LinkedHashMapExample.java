package com.company.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
//configured to make recent property come last in the list
        LinkedHashMap<String,Integer> phoneBook = new LinkedHashMap<>(4,0.75f,true);
        phoneBook.put("Arnold",2344555);
        phoneBook.put("Kalema",2344555);
        phoneBook.put("Suna",2344555);
        phoneBook.put("Racheal",2344555);
        getPhoneNumber(phoneBook,"Arnold");
        System.out.println(".......List of Contacts in  Phone Book........");
        for(Map.Entry<String,Integer> entry:phoneBook.entrySet() ){
            System.out.println(entry.getKey()+" :"+entry.getValue());
        }
    }
    static void getPhoneNumber(LinkedHashMap<String,Integer> phone,String name){
        System.out.println("....................................................................");
        System.out.println(name+"\"s Phone Number is :"+phone.get(name));
    }
}
