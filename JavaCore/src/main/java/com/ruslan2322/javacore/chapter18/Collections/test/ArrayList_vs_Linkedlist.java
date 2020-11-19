package main.java.com.ruslan2322.javacore.chapter18.Collections.Test;
import java.util.*;

public class ArrayList_vs_Linkedlist {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList<>();

        String jordge = "JordJe";
        String peter = "Peter";
        String goblin = "Dmitriy";

        arrayList.add(jordge);
        arrayList.add(peter);
        arrayList.add(goblin);


        System.out.println("ArrayList: ");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.remove(1);

        System.out.println(arrayList.get(1));

        System.out.println("\n======================\n");

        linkedList.add(jordge);
        linkedList.add(peter);
        linkedList.add(goblin);
        // В linkedlist добавляются метода getLast().. removeLast()

        System.out.println("LinkedList: ");
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        linkedList.remove(1);
        System.out.println(linkedList.getLast());


    }
}
