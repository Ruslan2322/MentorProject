package com.company.practice.facade;

public class SoberDriver {
    void rideForClient(OplataTwo oplataOne) {
        if (oplataOne.isActiveRide()) {
            System.out.println("Sober Driver doing his job...");
        } else {
            System.out.println("Sober Driver wait new order...");
        }
    }
}
