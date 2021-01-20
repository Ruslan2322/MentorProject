package com.company.practice.builder;

public class AutomaticRifleBuilder extends RifleBuilder {

    @Override
    void buildName() {
        rifle.setName("AK-47");
    }

    @Override
    void buildOptic() {
        rifle.setOptic(OpticSystem.NON_OPTIC);
    }

    @Override
    void buildMechanism() {
        rifle.setMechanism(Mechanism.AUTO);
    }

    @Override
    void buildPrice() {
        rifle.setPrice(750);
    }
}
