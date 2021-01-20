package com.company.practice.state;

public class Playing implements Activity {
    Pet pet;

    @Override
    public void action(Pet pet) {
        System.out.println("Playing with pet...");
        pet.setPlaying(pet.getPlayingConst());
        System.out.println("Pet tired.");
    }
}
