package com.company.practice.chain_of_responsibility;

public class DangerAlarm extends Alarm{

    public DangerAlarm(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Something went wrong fix it ASAP : "+ message);

    }
}
