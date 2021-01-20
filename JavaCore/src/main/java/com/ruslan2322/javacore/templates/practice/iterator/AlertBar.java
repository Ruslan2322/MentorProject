package com.company.practice.iterator;

public class AlertBar {
    AlertCollection alerts;

    public AlertBar(AlertCollection alerts) {
        this.alerts = alerts;
    }

    public void printAlerts(){
        Iterator iterator = alerts.createIterator();
        System.out.println("===============Alert BAR===============");
        while(iterator.hasNext()){
            Alert n = (Alert)iterator.next();
            System.out.println(n.getAlert());
        }
    }
}
