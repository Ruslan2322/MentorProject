package com.company.practice.composite;

public class PowerSupply implements SpareParts {
    void powerSupply(){
        System.out.println("Power module -beQuite 800W");
    }

    @Override
    public void doYourJob() {
        powerSupply();
    }
}
