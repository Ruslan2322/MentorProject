package com.company.practice.facade;

public class TaxiDriver {
    OplataOne oplataOne;

    void rideForClient(OplataOne oplataOne) {
        if (oplataOne.isActiveRide()) {
            System.out.println("Taxi Driver doing his job...");
        } else {
            System.out.println("Taxi Driver wait new order...");
        }
    }
}

