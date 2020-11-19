package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.Comparator;
// Использовать компаратор для сортировки счетов
// по фамилии вкладчиков

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TComp implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j,k;

        // найти индекс символа, с короторого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) // Фамилии совпадают, проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        else
            return k;
    }
    // переопределять метод equals() не требуется
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        // создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        // ввести элементы в древовидное отображение
        tm.put("John Dou", new Double(3434.34));
        tm.put("Tom Smith", new Double(123.22));
        tm.put("Jane Baker", new Double(1378.00));
        tm.put("Tod Hall", new Double(99.22));
        tm.put("Ralf Smith", new Double(-19.08));

        // получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет Джона Доу
        double balance = tm.get("John Dou");
        tm.put("John Dou", balance + 1000);
        System.out.println("New Jonh Dou's balance is: "+ tm.get("John Dou"));
    }
}
