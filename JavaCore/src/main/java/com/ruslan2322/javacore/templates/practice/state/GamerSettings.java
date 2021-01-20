package com.company.practice.state;

public class GamerSettings {
    Activity activity;
    Pet pet;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(Pet pet) {
        int a = 1 + (int)(Math.random() * 3);
        int b = 1 + (int)(Math.random() * 3);
        int c = 1 + (int)(Math.random() * 3);
        int d = 1 + (int)(Math.random() * 3);


        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i++) {

                if (pet.getHungry() < pet.getHungryConst()) {
                    Feeding feed = new Feeding();
                    feed.action(pet);
                } else if (pet.getWalkingIndicator() < pet.getWalkingConst()) {
                    Walking walking = new Walking();
                    walking.action(pet);
                } else if (pet.getHealth() < pet.getHealingConst()) {
                    Healing healing = new Healing();
                    healing.action(pet);
                } else if (pet.getPlaying() < pet.getPlayingConst()) {
                    Playing playing = new Playing();
                    playing.action(pet);
                }
            }
            pet.setWalkingIndicator(pet.getWalkingIndicator()-a);
            pet.setHungry(pet.getHungry() - b);
            pet.setPlaying(pet.getPlaying() -c);
            pet.setHealth(pet.getHealth() -d);
            System.out.println(pet.toString());

        }
    }
}



