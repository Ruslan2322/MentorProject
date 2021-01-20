package com.company.practice.abstract_factory;

/**
 * Програмка расчета персонала на разводку электрики для серверной комнаты
 * */

public class SPRRunner {
    public static void main(String[] args) {

        ElectricTeamFactory electricTeamFactory = new PowerRoomTeamFactory();
        Engineer engineer = electricTeamFactory.getEngineer();
        Electric electric = electricTeamFactory.getElectric();
        MontageSpecialist montageSpecialist = electricTeamFactory.getMontageSpecialist();


        System.out.println("job start...");
        engineer.calculate();
        montageSpecialist.montageEquipment();
        electric.connectEquipment();
        engineer.set();
    }
}
