package com.company.practice.command;

public class Enemy {
    int hitpoints;
    int enemyRadar;

    public Enemy(int hitpoints, int enemyRadar) {
        this.hitpoints = hitpoints;
        this.enemyRadar = enemyRadar;
    }

    public Enemy(int hitpoints) {
        this.hitpoints = 10 + (int)(Math.random() * 5);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "hitpoints=" + hitpoints +
                '}';
    }
}
