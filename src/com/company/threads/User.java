package com.company.threads;

public class User {
    static final BankAccount account = new BankAccount(50);
    public static void main(String[] args) {
        account.topUp(100);
        Thread t = new Thread(()->Atm.withDrawCash(account,120));
        Thread t1 = new Thread(()->Atm.withDrawCash(account,120));
        Thread t2 = new Thread(()->Atm.withDrawCash(account,100));
        t.start();
        t1.start();
        t2.start();

    }
}
