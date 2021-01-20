package com.company.practice.flyWeight;

public class Electrician implements Builder {

    @Override
    public void doJob() {
        System.out.println("Electrician connect wires...");
    }
}
