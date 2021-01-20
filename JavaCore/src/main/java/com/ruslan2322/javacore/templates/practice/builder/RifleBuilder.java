package com.company.practice.builder;

public abstract class RifleBuilder {

    Rifle rifle;

    Rifle getRifle(){
        return rifle;
    }

    void createRifle(){
        rifle = new Rifle();
    }

    abstract void buildName();
    abstract void buildOptic();
    abstract void buildMechanism();
    abstract void buildPrice();
}
