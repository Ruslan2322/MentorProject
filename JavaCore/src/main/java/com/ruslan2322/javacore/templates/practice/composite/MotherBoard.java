package com.company.practice.composite;

public class MotherBoard implements SpareParts {
    void slotItems(){
        System.out.println("Standard mother board");
    }

    @Override
    public void doYourJob() {
        slotItems();
    }
}
