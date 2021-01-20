package com.company.practice.builder;

public class HuntRifleBuilder extends RifleBuilder{
    @Override
    void buildName() {
        rifle.setName("TOZ-34");
    }

    @Override
    void buildOptic() {
        rifle.setOptic(OpticSystem.NON_OPTIC);
    }

    @Override
    void buildMechanism() {
        rifle.setMechanism(Mechanism.MANUAL);
    }

    @Override
    void buildPrice() {
        rifle.setPrice(300);
    }
}
