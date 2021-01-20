package com.company.practice.prototype;

public class ControlPanelRunner {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Petrov Semen", 345.32, 15);

        System.out.println(bankAccount);

        BankAcountFactory bankAcountFactory = new BankAcountFactory(bankAccount);
        BankAccount bankAccountClone = bankAcountFactory.cloneAccount();
        System.out.println("\n=========================================\n");

        System.out.println(bankAccountClone);

    }
}
