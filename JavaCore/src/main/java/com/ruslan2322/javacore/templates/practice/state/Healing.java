package com.company.practice.state;

public class Healing implements Activity {
    Pet pet;

    @Override
    public void action(Pet pet) {
        System.out.println("Healing pet...");
        pet.setHealth(pet.getHealingConst());
        System.out.println("Pet fell yourself well");
    }
}
