package com.company.practice.bridge;

public class OwlHead implements Head{
    @Override
    public void turnHead() {
        System.out.println("Owl head turn on 360 degrees");
    }
}
