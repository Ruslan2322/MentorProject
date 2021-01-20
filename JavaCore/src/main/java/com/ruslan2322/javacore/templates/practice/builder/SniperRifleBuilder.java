package com.company.practice.builder;

public class SniperRifleBuilder extends RifleBuilder{
    @Override
    void buildName() {
        rifle.setName("SVD");
    }

    @Override
    void buildOptic() {
        rifle.setOptic(OpticSystem.OPTIC);
    }

    @Override
    void buildMechanism() {
        rifle.setMechanism(Mechanism.AUTO);
    }

    @Override
    void buildPrice() {
        rifle.setPrice(2000);}
    }

