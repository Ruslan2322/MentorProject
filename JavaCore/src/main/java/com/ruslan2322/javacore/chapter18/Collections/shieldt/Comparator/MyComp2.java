package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComp2 implements Comparator<String>{
    public int compare(String aStr, String bStr){
        return aStr.compareTo(bStr);
    }
}
class CompDemo2 {
    public static void main(String[] args) {

        // передать компаратор с обратным упорядочением
        // древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<String>((aStr,bStr) -> bStr.compareTo(aStr));

        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // вывести элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
        }

    }

