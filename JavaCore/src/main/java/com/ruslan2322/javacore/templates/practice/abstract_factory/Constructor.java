package com.company.practice.abstract_factory;

public class Constructor implements Engineer {
    @Override
    public void calculate() {
        System.out.println("Constructor calculate equipments and materials...");
    }

    @Override
    public void set() {
    }
}
