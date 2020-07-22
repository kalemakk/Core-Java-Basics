package com.company.threads;

public class Deadlock {
    public static  Object spoon =new Object();
    public static  Object bowl = new Object();

    public static void main(String[] args) {
        Thread cook1 = new Thread(()->{
            synchronized(bowl){
                System.out.println("have bowl");
                synchronized (spoon){
                    System.out.println("have bowl and spoon");
                }
            }
        });
        Thread cook2 = new Thread(()->{
            synchronized(spoon){
                System.out.println("have spoon");
                synchronized (bowl){
                    System.out.println("have bowl and spoon");
                }
            }
        });
        cook1.start();
        cook2.start();

    }
}
