package com.company.practice.chain_of_responsibility;

public abstract class Alarm {
    private int priority;
    private Alarm nextAlarm;

    public Alarm(int priority) {
        this.priority = priority;
    }

    public void setNextAlarm(Alarm nextAlarm) {
        this.nextAlarm = nextAlarm;
    }

    public void alarmManager(String message, int level){
        if (level >= priority){
            write(message);
        }
        if (nextAlarm != null){
            nextAlarm.alarmManager(message, level);
        }
    }
    public abstract void write(String message);
}
