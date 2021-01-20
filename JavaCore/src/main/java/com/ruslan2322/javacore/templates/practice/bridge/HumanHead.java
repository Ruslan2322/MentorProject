package com.company.practice.bridge;

public class HumanHead implements Head{
    @Override
    public void turnHead() {
        System.out.println("Robot turn human head left n right...");
    }
}
