package com.company.practice.strategy;

public class Balance implements Activity {
    @Override
    public void action() {
        System.out.println("Showing current balance...");
    }
}
