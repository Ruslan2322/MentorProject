package com.company.practice.builder;

public class GunCreator {
    RifleBuilder riflebuilder;

    public void setBuilder(RifleBuilder riflebuilder) {
        this.riflebuilder = riflebuilder;
    }

    public Rifle buildRifle(){
        riflebuilder.createRifle();
        riflebuilder.buildName();
        riflebuilder.buildOptic();
        riflebuilder.buildMechanism();
        riflebuilder.buildPrice();

        Rifle rifle = riflebuilder.getRifle();

        return rifle;
    }
}
