package com.company.practice.templateMethods;

import java.nio.charset.StandardCharsets;

// Базовый класс соц. сети
public abstract class Network {
    String userName;
    String password;

    public Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    Network (){}

    // Публикация данных в любой  сети
    public boolean post(String message){
        // Проверка данных пользователей перед постом в соцсеть. Каждая сеть для
        // проверки использует разные методы.
        if (logIn(this.userName, this.password)){
            //отпрака данных
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
