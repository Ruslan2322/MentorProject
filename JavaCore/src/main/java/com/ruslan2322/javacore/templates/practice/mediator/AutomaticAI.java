package com.company.practice.mediator;

public class AutomaticAI implements Systems {
    MonitoringSystem monitoringSystem;
    String name;

    public AutomaticAI(MonitoringSystem monitoringSystem, String name) {
        this.monitoringSystem = monitoringSystem;
        this.name = name;
    }

    public AutomaticAI(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        monitoringSystem.sendMessage(message, this);

    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message "+ message+ ".");
    }
}
