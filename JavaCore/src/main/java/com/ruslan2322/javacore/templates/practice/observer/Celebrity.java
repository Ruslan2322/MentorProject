package com.company.practice.observer;


import java.util.ArrayList;

// Этот класс расширяется интерфейсом Subject
public class Celebrity implements  Subject {
    private String celebrityName;
    private ArrayList<Observer> followers;

    public Celebrity(String celebrityName) {
        this.celebrityName = celebrityName;
        followers = new ArrayList<>();
    }
    // add new follower
    @Override
    public void register(Observer o) {
        followers.add(o); // регистрация подписчика
        System.out.println(o + " has started following "+ celebrityName);
    }

    // delete followers
    @Override
    public void unregister(Observer o) {
        followers.remove(o);
        System.out.println(o + " has stopped following "+ celebrityName);
    }

    // Оповещение всех зарегестрированных подписчиков
    @Override
    public void notifyAllObservers(String tweet) {
        for (Observer follower: followers){
            follower.update(celebrityName, tweet);
        }
        System.out.println();
    }
    // Этот метод обновляет твиты
    public void tweet(String tweet){
        System.out.println("\n"+ celebrityName + " has tweeted :: "+ tweet + " \n");
    }
}
