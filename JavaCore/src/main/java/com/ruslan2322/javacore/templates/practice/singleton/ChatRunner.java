package com.company.practice.singleton;

public class ChatRunner {
    public static void main(String[] args) {
        ChatRegistration.getChatRegistration().addNewChater("Vasya");
        ChatRegistration.getChatRegistration().addNewChater("Yulya");
        ChatRegistration.getChatRegistration().addNewChater("Nika");

        ChatRegistration.getChatRegistration().showLogFile();
    }
}
