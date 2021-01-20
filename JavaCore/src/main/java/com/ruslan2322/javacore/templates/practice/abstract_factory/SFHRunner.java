package com.company.practice.abstract_factory;

/**
 * Програмка расчета персонала на разводку электрики для 2-х этажного дома
 * */

public class SFHRunner {
    public static void main(String[] args) {
        ElectricTeamFactory electricTeamFactory = new StandartHomeTeamFactory();
        Electric electric = electricTeamFactory.getElectric();
        MontageSpecialist montageSpecialist = electricTeamFactory.getMontageSpecialist();
        Engineer engineer = electricTeamFactory.getEngineer();

        System.out.println("job start...");
        engineer.calculate();
        montageSpecialist.montageEquipment();
        electric.connectEquipment();
    }
}
