package com.company.practice.factory;

public class Student implements Customer {
    @Override
    public void payDebt() {
        System.out.printf("Price including discount for students  = 8.5$");
    }
}



