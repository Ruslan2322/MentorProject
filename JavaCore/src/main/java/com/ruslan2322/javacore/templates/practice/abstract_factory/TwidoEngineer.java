package com.company.practice.abstract_factory;

public class TwidoEngineer implements Engineer {
    @Override
    public void calculate() {
        System.out.println("Twido Engineer calculate equipments and materials...");
    }

    @Override
    public void set() {
        System.out.println("Twido Engineer set twido controller...");
    }
}
