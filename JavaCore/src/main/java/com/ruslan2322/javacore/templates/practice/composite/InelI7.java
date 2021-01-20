package com.company.practice.composite;

public class InelI7 implements Processor,SpareParts {
    @Override
    public void calculateAlgo() {
        System.out.println("Intel i7 has 4 cores  with frequency - 4,4 GHz");
    }

    @Override
    public void doYourJob() {
        calculateAlgo();
    }
}
