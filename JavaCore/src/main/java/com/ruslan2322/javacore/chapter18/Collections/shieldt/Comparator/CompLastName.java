package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.Comparator;
// Использовать метод thenComparing() для сортировки
// счетов вкладчиков сначала по фамилии, а затем по имени


import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

// Компаратор сравнивает фамилии вкладчиков
public class CompLastName implements Comparator<String> {
    public int compare(String aStr, String bStr){
        int i,j;

        // найти индекс символа с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return  aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

// отсортировать счета вкладчиков по Ф.И.О., если фамилии одинаковы
class CompThenByFirstName implements Comparator<String>{
    public int compare(String aStr, String bStr){
        int i,j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A{
    public static void main(String[] args) {
        // использовать метод thenComparing() для создания
        // компаратора, сравнивающего сначала фамилии, а затем
        // Ф.И.О. вкладчиков, если фамилии одинаковы
        CompLastName compLN = new CompLastName();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());

        // создать древовидное отображение
        TreeMap<String,Double> tm = new TreeMap<String, Double>(compLastThenFirst);

        // ввести элементы в древовидное отображение
        tm.put("John Dou", new Double(3434.34));
        tm.put("Tom Smith", new Double(123.22));
        tm.put("Jane Baker", new Double(1378.00));
        tm.put("Tod Hall", new Double(99.22));
        tm.put("Ralf Smith", new Double(-19.08));

        // получить множество элементов
        Set<Map.Entry<String,Double>> set = tm.entrySet();

        // вывести элементы из множества
        for (Map.Entry<String,Double> me : set){
            System.out.print(me.getKey()+ ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму в 1000 на счет Джона Доу
        double balance = tm.get("John Dou");
        tm.put("John Dou", balance + 1000);

        System.out.println("John Dou's new current balance: "+ tm.get("John Dou"));

    }
}
