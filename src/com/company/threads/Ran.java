package com.company.threads;

public class Ran implements Runnable {
    @Override
    public void run() {
        int i =0;
        while (i<50){
            System.out.println(i+" the thread is "+Thread.currentThread().getName());
            i++;
        }
    }

    public static void main(String[] args) {
        Thread t =new Thread(new Ran());
        t.start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =0;
                while (i<60){
                    System.out.println(i+" the dude is "+Thread.currentThread().getName());
                    i++;
                }

            }
        });
        t1.start();

    }
}
