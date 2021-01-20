package com.company.practice.composite;

public class NVidiaCard implements VideoCard, SpareParts {
    @Override
    public void videoPoduct() {
        System.out.println("RTX 3080 TI with ray tracing - 16Gb video memory.");
    }

    @Override
    public void doYourJob() {
        videoPoduct();
    }
}
