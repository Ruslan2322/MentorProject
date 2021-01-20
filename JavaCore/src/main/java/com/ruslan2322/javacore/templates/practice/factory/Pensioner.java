package com.company.practice.factory;

public class Pensioner implements Customer{
    @Override
    public void payDebt() {
        System.out.printf("Price including discount for pensioners  = 5$");
    }
}
