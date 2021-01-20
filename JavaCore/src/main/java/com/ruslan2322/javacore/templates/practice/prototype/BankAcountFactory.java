package com.company.practice.prototype;

public class BankAcountFactory {
    BankAccount bankAccount;

    public BankAcountFactory(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    BankAccount cloneAccount(){
       return(BankAccount) bankAccount.clintAccess();
    }
}
