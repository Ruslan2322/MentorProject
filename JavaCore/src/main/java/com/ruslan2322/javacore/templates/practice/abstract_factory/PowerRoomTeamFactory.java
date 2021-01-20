package com.company.practice.abstract_factory;

public class PowerRoomTeamFactory implements ElectricTeamFactory {
    @Override
    public Electric getElectric() {
        return new ElectricUsual();
    }

    @Override
    public Engineer getEngineer() {
        return new TwidoEngineer();
    }

    @Override
    public MontageSpecialist getMontageSpecialist() {
        return new MontageSpecialistUsual();
    }
}
