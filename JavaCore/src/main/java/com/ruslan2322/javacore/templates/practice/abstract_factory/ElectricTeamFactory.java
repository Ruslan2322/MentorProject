package com.company.practice.abstract_factory;

public interface ElectricTeamFactory {
    Electric getElectric();
    Engineer getEngineer();
    MontageSpecialist getMontageSpecialist();
}
