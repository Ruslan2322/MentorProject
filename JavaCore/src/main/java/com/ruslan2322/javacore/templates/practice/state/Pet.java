package com.company.practice.state;

public class Pet {
    private int hungry;
    private int walkingIndicator;
    private int health;
    private int playing;
    private final int hungryConst = 17;
    private final int walkingConst = 20;
    private final int playingConst = 30;
    private final int healingConst = 12;

    public Pet() {
        this.hungry = 5 + (int) (Math.random() * 5);
        this.walkingIndicator = 5 + (int) (Math.random() * 5);
        this.health = 5 + (int) (Math.random() * 5);
        this.playing = 5 + (int) (Math.random() * 5);
    }

    public int getHungryConst() { return hungryConst; }

    public int getWalkingConst() { return walkingConst; }

    public int getPlayingConst() { return playingConst; }

    public int getHealingConst() { return healingConst; }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry1){
        hungry = hungry1;
    }

    public int getWalkingIndicator() {
        return walkingIndicator;
    }

    public void setWalkingIndicator(int walkingIndicator1){
        walkingIndicator = walkingIndicator1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health1){
        health = health1;
    }

    public int getPlaying() {
        return playing;
    }

    public void setPlaying(int playing1){
        playing = playing1;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "hungry=" + hungry +
                ", walkingIndicator=" + walkingIndicator +
                ", health=" + health +
                ", playing=" + playing +
                '}';
    }
}
