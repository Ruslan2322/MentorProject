package main.java.com.ruslan2322.javacore.chapter18.Collections.proselyte.Comparator;

import java.util.Comparator;

public class Developer implements Comparator<Developer>, Comparable<Developer> {
    private String name;
    private int salary;

    public Developer() {
    }

    public Developer(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * Methods for comparing
     */

    @Override
    public int compareTo(Developer developer){
        return this.name.compareTo(developer.name);
    }


    @Override
    public int compare(Developer developer1, Developer developer2) {
        return developer1.salary - developer2.salary;
    }

    @Override
    public String toString() {
        return  "\n"+"  Developer info:" +
                "\n" + "  Name: " + name +
                "\n"+"  Salary: " + salary + "\n";
    }
}
