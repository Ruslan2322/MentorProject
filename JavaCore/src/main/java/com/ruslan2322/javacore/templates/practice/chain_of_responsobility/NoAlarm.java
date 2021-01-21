package com.company.practice.chain_of_responsibility;

public class NoAlarm extends Alarm{

    public NoAlarm(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Equipment work in state mode.. : "+ message);
    }
}
