package com.company.practice.memento;

public class Memento {

    private int health;

    public Memento(int health) {
        this.health = health;
    }

    public int getState(){
        return health;
}
}
