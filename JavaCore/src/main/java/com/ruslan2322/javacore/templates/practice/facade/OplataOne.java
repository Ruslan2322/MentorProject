package com.company.practice.facade;

public class OplataOne {
    private  boolean activeRide;

    public boolean isActiveRide(){
        return activeRide;
    }

    public void startRide(){
        System.out.println("Taxi start riding...");
        activeRide = true;
    }

    public void finishRide(){
        System.out.println("Driver finished riding...");
        activeRide = false;
    }
}
