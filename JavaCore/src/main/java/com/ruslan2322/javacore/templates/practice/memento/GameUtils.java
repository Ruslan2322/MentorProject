package com.company.practice.memento;

import java.util.Date;

public class GameUtils {

    private Memento memento;
    private Date date;

    public void SaveState(IOriginator originator){

        if (originator == null)
            throw new NullPointerException("originator is null");

        memento = originator.getMemento();

        System.out.println("Save state");
        date = new Date();
        System.out.println(date);

    }

    public void loadState(IOriginator originator) throws InterruptedException {

        if (originator == null)
            throw new NullPointerException("originator is null");

        if (memento == null)
            throw new NullPointerException("memento is null");

        originator.setMemento(memento);
        date = new Date();

        Thread.sleep(3000);

        System.out.println("Load State");
        System.out.println(date);
    }
}
