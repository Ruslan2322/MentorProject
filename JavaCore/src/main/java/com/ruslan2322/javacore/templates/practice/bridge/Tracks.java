package com.company.practice.bridge;

public class Tracks implements Chassis{
    @Override
    public void run() {
        System.out.println("Robot running with racks...");
    }
}
