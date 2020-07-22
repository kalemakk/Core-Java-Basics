package com.company.collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("arnold",24431);
        phoneBook.put("jean",34221);
        phoneBook.put("john",2331);
        phoneBook.put("arnold",1111);
        phoneBook.put(null,78484);
        getPhoneNumbers(phoneBook);
        removePhoneNumber(null,phoneBook);
        getPhoneNumbers(phoneBook);
    }
    static void getPhoneNumbers(HashMap<String,Integer> phone){
        System.out.println("............phone Book ................");
        for (HashMap.Entry<String,Integer> enter:phone.entrySet()){
            System.out.println(enter.getKey()+"  "+enter.getValue());
        }
    }
    static void removePhoneNumber(String name, HashMap<String,Integer> phone){
        if(phone.containsKey(name)){
            phone.remove(name);
            System.out.println();
            System.out.println(name+" has been removed");
            System.out.println();
        }else {
            System.out.println("nothing dude");
        }
    }

}
