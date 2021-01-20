package com.company.practice.templateMethods;

public class Twitter extends Network {
    public Twitter(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\nCheking user's parameters");
        System.out.println("Name: "+this.userName);
        System.out.println("Password: ");
        for (int i = 0; i < this.password.length(); i++){
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogin success on Twitter");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: ' " + new String(data) + "' was posted on Twitter");
            return true;
        } else {
            return false;
        }
    }

    @Override
    void logOut() {
        System.out.println("User: '"+ userName + "' was logged from twitter");
    }

    private void simulateNetworkLatency(){
        try{
            int i = 0;
            System.out.println();
            while (i < 10){
                System.out.println(".");
                Thread.sleep(500);
                i++;
            }
        }catch (InterruptedException exc){
            exc.printStackTrace();
        }
    }
}

