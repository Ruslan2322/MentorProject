package com.company.practice.bridge;

public class MuscleBody extends Body{

    public MuscleBody(Head head, Chassis chassis) {
        super(head, chassis);
    }

    @Override
    public void createRobot() {
        System.out.println("Muscle body has + 20 power points");
        head.turnHead();
        chassis.run();
    }
}
