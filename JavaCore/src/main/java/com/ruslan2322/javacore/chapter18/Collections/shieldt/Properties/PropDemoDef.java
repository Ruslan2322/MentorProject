package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.Properties;
// Использовать список свойств по умолчанию
import java.util.*;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Florida", "Telessi");
        defList.put("Viskonsin", "Madison");
        Properties capitals = new Properties(defList);
        capitals.put("Illinoys", "Springfield");
        capitals.put("Missouri", "Jefferson-city");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // вывести все штаты и их столицы
        for (Object name : states)
            System.out.println("State Capital : "+ name + " - " + capitals.getProperty((String)name)+ "." );

        // теперь штат Флорида будет найден в списке по умолчанию
        String str = capitals.getProperty(("Florida"));
        System.out.println("The Capital of Florida is "+ str+ ".");


    }
}
