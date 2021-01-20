package com.company.practice.composite;

public class Ryzen5 implements Processor,SpareParts{
    @Override
    public void calculateAlgo() {
        System.out.println("Ryzon 5 has 6 cores  with frequency - 3.3 GHz");
    }

    @Override
    public void doYourJob() {
        calculateAlgo();
    }
}
