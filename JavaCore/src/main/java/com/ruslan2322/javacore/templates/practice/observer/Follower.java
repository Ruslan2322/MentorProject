package com.company.practice.observer;

// Этот класс расширяет интерфейс Observer

public class Follower implements Observer {

    private  String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String celebrityName, String tweet) {
        System.out.println(followerName + " has received "+ celebrityName+
                 " 's tweet :: " + tweet);
    }

    @Override
    public String toString() {
        return followerName;

    }
}
