package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.Hashtable;
// Продемонстрировать применение класса Hashtable

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String,Double>();
        Enumeration <String> names;

        String str;
        double bal;

        balance.put("John Dou", new Double(3434.34));
        balance.put("Tom Smith", new Double(123.22));
        balance.put("Jane Baker", new Double(1378.00));
        balance.put("Tod Hall", new Double(99.22));
        balance.put("Ralf Smith", new Double(-19.08));

        // показать все счета в хэш-таблице
        names = balance.keys();
        while(names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // внести 1000 на счет Джона Доу
        bal = balance.get("John Dou");
        balance.put("John Dou", bal + 1000);
        System.out.println("New John Dou's balanse is: "+ balance.get("John Dou"));
    }
}
