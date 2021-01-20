package com.company.practice.facade;

public class SoberDriverOrder {
    DriveCar taxi = new DriveCar();
    OplataTwo oplataTwo = new OplataTwo();
    SoberDriver driver = new SoberDriver();

    public void executeOrder(){
        taxi.diveCar();
        oplataTwo.startRide();
        driver.rideForClient(oplataTwo);
    }
}
