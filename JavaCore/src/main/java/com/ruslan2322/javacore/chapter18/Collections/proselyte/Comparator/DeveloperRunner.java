package main.java.com.ruslan2322.javacore.chapter18.Collections.proselyte.Comparator;
import java.util.*;

public class DeveloperRunner {
    public static void main(String[] args) {

        System.out.println("Creating new employers accounts...");
        Developer d1 = new Developer("AsyaSmile", 2000);
        Developer d2 = new Developer("Ivan", 1500);
        Developer d3 = new Developer("Konstantin", 1000);
        Developer d4 = new Developer("Peter", 3000);
        Developer d5 = new Developer("Proselyte", 2500);


        System.out.println("Adding new employers...");
        List<Developer> myTeam = new ArrayList<Developer>();

        Collections.addAll(myTeam,d3,d2,d1,d5,d4);
        System.out.println(myTeam);

        System.out.println("====================================");

        System.out.println("Using standard sorting...");

        Collections.sort(myTeam);
        System.out.print(myTeam);
        System.out.println();
        System.out.println("====================================");

        System.out.println("Using custom comparator: ");
        Collections.sort(myTeam,Developer::compareTo);
        System.out.println(myTeam);

        System.out.println("====================================");

        System.out.println(d1.compareTo(d2));


    }
}
