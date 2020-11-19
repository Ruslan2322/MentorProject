package main.java.com.ruslan2322.javacore.chapter18.Collections.shieldt.List.ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        // ввести все элементы в списочный массив
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        System.out.println("Содержимое списочного массива a1: "+ a1);

        // получить обычный массив
        Integer ia[] = new Integer[a1.size()];
        ia = a1.toArray(ia);

        int sum = 0;

        // суммировать элементы массива
        for (int i : ia) sum += i;

        System.out.println("Сумма : " + sum);
    }
}
