package com.company.practice.composite;

public class RAM implements SpareParts {
    void infoSave(){
        System.out.println("RAM DDR 3 - 16Gb");
    }

    @Override
    public void doYourJob() {
        infoSave();
    }
}
