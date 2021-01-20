package com.company.practice.bridge;

public class SquareBody extends Body{

    public SquareBody(Head head, Chassis chassis) {
        super(head, chassis);
    }

    @Override
    public void createRobot() {
        System.out.println("Square body has + 200 heal points");
        head.turnHead();
        chassis.run();
    }
}
