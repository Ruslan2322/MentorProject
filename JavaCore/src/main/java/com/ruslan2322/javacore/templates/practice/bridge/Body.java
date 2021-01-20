package com.company.practice.bridge;

public abstract class Body {
    Head head;
    Chassis chassis;

    public Body(Head head, Chassis chassis) {
        this.head = head;
        this.chassis = chassis;
    }

    public abstract void createRobot();

}



