package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.Properties;
// Продемонстрировать применение списка свойств

import java.util.Properties;
import java.util.Set;
import java.util.*;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Illinoys", "Springfield");
        capitals.put("Missouri", "Jefferson-city");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // получить множество ключей
        Set<?>states = capitals.keySet();

        // показать все штаты и их столицы
        for (Object name : states){
            System.out.println("State Capital : "+ name + " - " + capitals.getProperty((String)name)+ "." );
        }
        System.out.println();

        // найти штат отсутствующий в списке указав значение,
        // выбираемые по умолчанию

        String str = capitals.getProperty("Florida", " not founded");
        System.out.println("The capital of Florida state is : "+ str + ".");
    }
}
