package com.company.practice.strategy;

public class Withdraw implements Activity{
    @Override
    public void action() {
        System.out.println("Withdraw money..");
    }
}
