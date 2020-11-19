package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.Hashtable;
// Применить итераторы вместе с классом Hashtable

import java.util.Hashtable;
import java.util.*;

public class HT2Demo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance =
                new Hashtable<String, Double>();

        String str;
        double bal;

        balance.put("John Dou", new Double(3434.34));
        balance.put("Tom Smith", new Double(123.22));
        balance.put("Jane Baker", new Double(1378.00));
        balance.put("Tod Hall", new Double(99.22));
        balance.put("Ralf Smith", new Double(-19.08));

        // вывести все счета в хеш-таблице. Сначала получить
        // представление всех ключей ввиде множества
        Set<String> set = balance.keySet();

        // получить итератор
        Iterator<String>itr = set.iterator();

        while(itr.hasNext()){
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        // внести 1000 на счет Джона Доу
        bal = balance.get("John Dou");
        balance.put("John Dou", bal + 1000);
        System.out.println("New John Dou's balanse is: "+ balance.get("John Dou"));

    }
}
