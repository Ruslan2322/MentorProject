package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.List.LinkedList;

import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args) {
        // создать связный список
        LinkedList<String> a1 = new LinkedList<String>();

        // ввести элементы в связный список
        a1.add("F");
        a1.add("B");
        a1.add("D");
        a1.add("E");
        a1.add("C");
        a1.addLast("Z");

        a1.addFirst("A");
        a1.add(1,"A2");

        System.out.println(
                "Исходное содержимое связного списка a1: "+ a1);

        // удалить элементы из связного списка
        a1.remove("F");
        a1.remove(2);
        System.out.println(
                "Содержимое связного списка a1 после удаления первого и последнего элементов " + a1);

        // получить и присвоить значение
        String val = a1.get(2);
        System.out.println(val);
        a1.set(3, val + " изменено ");

        System.out.println(
                "Содержимое связного списка после изменения : "+ a1);
    }
}
