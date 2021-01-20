package com.company.practice.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleMonitoringSistem implements MonitoringSystem {
    Systems admin;
    List<Systems> users = new ArrayList<>();

    public void setAdmin(Systems admin) {
        this.admin = admin;
    }

    public void addUserToChat(Systems user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, Systems user) {
        for (Systems u : users){
            if (u!=user){
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
