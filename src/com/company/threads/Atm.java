package com.company.threads;

public class Atm {
    static synchronized void withDrawCash(BankAccount account,int amount){
        if(account.getBalance() - amount < -account.getOverDraft()){
            System.out.println("Transaction Denied");
        }else {
            account.debt(amount);
            System.out.println("Account Withdrawn is : "+amount);
        }
        System.out.println("Balance is : "+account.getBalance());
    }
}
