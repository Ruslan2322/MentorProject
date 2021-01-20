package com.company.practice.state;

public class Walking implements Activity {
    Pet pet;

    @Override
    public void action(Pet pet) {
        System.out.println("Walking with "+pet);
        pet.setWalkingIndicator(pet.getWalkingConst());
        System.out.println("Pet went to the potty");
    }
}
