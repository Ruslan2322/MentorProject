package com.company.practice.prototype;

public class BankAccount implements CopyBankAccount {
    private String name;
    private double money;
    private int actions;

    public BankAccount(String name, double money, int actions) {
        this.name = name;
        this.money = money;
        this.actions = actions;
    }

    public BankAccount(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getActions() {
        return actions;
    }

    public void setActions(int actions) {
        this.actions = actions;
    }


    @Override
    public Object clintAccess() {
        BankAccount client = new BankAccount(name, money);
        return client;
    }

    @Override
    public Object employeeAccess() {
        BankAccount emplyee = new BankAccount(name,money, actions);
        return emplyee;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", actions=" + actions +
                '}';
    }
}
