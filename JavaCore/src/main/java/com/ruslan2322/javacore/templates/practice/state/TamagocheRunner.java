package com.company.practice.state;

public class TamagocheRunner {
    public static void main(String[] args) {

        Pet dog = new Pet();

        System.out.println(dog.toString());

        GamerSettings gamerSettings1 = new GamerSettings();

        gamerSettings1.changeActivity(dog);
        System.out.println(dog.toString());


    }
}
