package com.company.practice.templateMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworkRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Input user name: ");
        String userName = reader.readLine();
        System.out.println("Input password: ");
        String password = reader.readLine();

        // Вводим сообщение
        System.out.println("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n"+
                "1 - Facebook\n"+
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Создаём сетевые объекты и публикуем пост.
        if (choice == 1){
            network = new Facebook(userName,password);
        } else  if (choice == 2){
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
