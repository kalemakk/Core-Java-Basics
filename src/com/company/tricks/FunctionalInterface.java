package com.company.tricks;

public class FunctionalInterface {
    public static void main(String[] args) {
        GreetingMessage message = name -> {
            System.out.println();
            System.out.println("Hello "+name+" the greatest coder in EastAfrica");
        };
        message.greet("arnoldkk");
        Lambda lo =(comment)-> System.out.println("message: "+comment);
        lo.sendComment("Hey there how are you");


    }
}
