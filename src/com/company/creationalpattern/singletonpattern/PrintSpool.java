package com.company.creationalpattern.singletonpattern;

public class PrintSpool {
    private static PrintSpool spool;
    private static boolean initialized =false;
    private PrintSpool(){}

    public static synchronized void getInstance(){
        if (initialized) {
            System.out.println("done dude "+spool.hashCode());
            return;
        }
        spool = new PrintSpool();
        spool.init();
        initialized= true;
        System.out.println("creating now "+spool.hashCode());
    }

    @SuppressWarnings("EmptyMethod")
    private void init(){

    }
}
