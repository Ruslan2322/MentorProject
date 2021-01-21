package com.company.practice.chain_of_responsibility;

public class SoftAlarm extends Alarm{

    public SoftAlarm(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Alarm is not critical : "+message);

    }
}
