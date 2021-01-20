package com.company.practice.state;

public class Feeding implements  Activity{
    Pet pet;

    @Override
    public void action(Pet pet) {
        System.out.println("Feeding pet...");
        pet.setHungry(pet.getHungryConst());
        System.out.println("Pet well-fed");

    }
}
