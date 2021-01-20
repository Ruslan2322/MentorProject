package com.company.practice.abstract_factory;

public class StandartHomeTeamFactory implements ElectricTeamFactory {

    @Override
    public Electric getElectric() {
        return new ElectricUsual();
    }

    @Override
    public Engineer getEngineer() {
        return new Constructor();
    }

    @Override
    public MontageSpecialist getMontageSpecialist() {
        return new MontageSpecialistUsual();
    }
}
