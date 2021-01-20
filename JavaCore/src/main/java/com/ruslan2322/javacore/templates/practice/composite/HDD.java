package com.company.practice.composite;

public class HDD implements SpareParts {
    void hardDisk(){
        System.out.println("Hard Disk is SSD Kingston 1Tb");
    }

    @Override
    public void doYourJob() {
        hardDisk();
    }
}
