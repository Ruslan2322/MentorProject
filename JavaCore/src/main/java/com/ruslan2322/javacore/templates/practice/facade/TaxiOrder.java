package com.company.practice.facade;

public class TaxiOrder {
    DriveTaxi taxi = new DriveTaxi();
    OplataOne oplataOne = new OplataOne();
    TaxiDriver driver = new TaxiDriver();

    public void executeOrder(){
        taxi.diveCar();
        oplataOne.startRide();
        driver.rideForClient(oplataOne);
    }
}
