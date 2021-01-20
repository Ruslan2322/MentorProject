package com.company.practice.singleton;


public class ChatRegistration {
    private static ChatRegistration chatRegistration;
    private String name = "This is chat. \n\n";


    public static synchronized ChatRegistration getChatRegistration(){
        if (chatRegistration == null){
            chatRegistration = new ChatRegistration();
        }
        return chatRegistration;
    }

    private ChatRegistration() {}

    public void addNewChater(String cName){
        name += cName + "\n";
    }

    public void showLogFile(){
        System.out.println(name);
    }
}
