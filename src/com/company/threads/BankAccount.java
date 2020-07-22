package com.company.threads;

public class BankAccount {
    private int balance;
    private final int overDraft;

    BankAccount(int overDraft){
        this.overDraft =overDraft;
    }
    public void topUp(int amount){
        this.balance +=amount;
    }
    public void debt(int amount){
        balance -=amount;
    }
    public int getBalance() {
        return balance;
    }
    public int getOverDraft() {
        return overDraft;
    }

}
