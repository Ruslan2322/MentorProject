package com.company.practice.bridge;

/**
 * Симмулятор создателя роботов
 * */

public class RobotCreator {
    public static void main(String[] args) {

        Body[] bodies = {
                new MuscleBody(new HumanHead(), new Tracks()), new SquareBody(new OwlHead(), new legs()), new MuscleBody(new OwlHead(), new legs())
        };

        for (Body body: bodies){
            System.out.println("\n================================\n");
            body.createRobot();
        }
    }
}
