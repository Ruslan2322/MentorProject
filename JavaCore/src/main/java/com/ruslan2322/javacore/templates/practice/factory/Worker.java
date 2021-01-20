package com.company.practice.factory;

public class Worker implements Customer{
    @Override
    public void payDebt() {
        System.out.printf("Price including discount for workers  = 10$");
    }
}
