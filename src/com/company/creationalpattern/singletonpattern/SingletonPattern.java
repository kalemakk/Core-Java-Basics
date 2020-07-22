package com.company.creationalpattern.singletonpattern;

public class SingletonPattern {
    public static void main(String[] args) {
        @SuppressWarnings("unused") PrintSpool spool;
//        PrintSpool spool1= PrintSpool.getInstance();

//        Thread t = new Thread(PrintSpool::getInstance);
        Thread t = new Thread(PrintSpool::getInstance);
        Thread t1 = new Thread(PrintSpool::getInstance);
        Thread t2 = new Thread(PrintSpool::getInstance);
        Thread t3 = new Thread(PrintSpool::getInstance);

//        Thread t1 = new Thread(PrintSpool::getInstance);
        t3.start();
        t1.start();
        t2.start();
        t.start();



//        System.out.println(t.hashCode());
//        System.out.println(t1.hashCode());

    }
}
