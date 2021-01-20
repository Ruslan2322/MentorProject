package com.company.practice.composite;

public class AMDCard implements VideoCard,SpareParts {
    @Override
    public void videoPoduct() {
        System.out.println("Radeon VII  with ray tracing - 16Gb video memory.");

    }

    @Override
    public void doYourJob() {
        videoPoduct();
    }
}
