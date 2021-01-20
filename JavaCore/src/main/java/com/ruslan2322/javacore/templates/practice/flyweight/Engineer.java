package com.company.practice.flyWeight;

public class Engineer implements Builder{
    @Override
    public void doJob() {
        System.out.println("Engineer connect electrical equipment...");
    }
}
