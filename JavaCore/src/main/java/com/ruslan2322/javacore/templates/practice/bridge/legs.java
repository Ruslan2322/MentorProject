package com.company.practice.bridge;

public class legs implements Chassis {
    @Override
    public void run() {
        System.out.println("Robot has powerful legs...");
    }
}
