package com.company.practice.abstract_factory;

public class ElectricUsual implements Electric {
    @Override
    public void connectEquipment() {
        System.out.println("Electric connect equipment and wires...");
    }
}
