package com.company.threads;

public class threads extends Thread{

    @Override
    public void run() {
        int i = 0;
        while (i<=100){
            System.out.println(i+" thread is "+this.getName());
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        threads t = new threads();
        t.start();
        threads t1 = new threads();
        t1.start();

    }
}
