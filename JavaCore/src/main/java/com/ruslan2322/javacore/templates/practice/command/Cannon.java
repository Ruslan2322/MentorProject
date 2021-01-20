package com.company.practice.command;

public class Cannon {
    Cannon cannon;
    Enemy enemy;
     int damage;

    public Cannon(int damage) {
        this.damage = damage;
    }

    public void loadCannon(){
        System.out.println("Loading empty cannon...");
    }

    public void lookTarget(){
        System.out.println("System looking for targets...");
    }

    public void hitTarget(Cannon cannon, Enemy enemy){
        System.out.println("System hitting to target...");
        int helths;
        helths = enemy.hitpoints - cannon.damage;
        enemy.hitpoints = helths;
    }

    public void clearCannon(){
        System.out.println("Clearing weapon after shooting...");
    }

    @Override
    public String toString() {
        return "Cannon{" +
                "damage=" + damage +
                '}';
    }
}
