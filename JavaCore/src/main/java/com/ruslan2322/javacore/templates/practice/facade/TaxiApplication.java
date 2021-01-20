package com.company.practice.facade;

/**
 * Такси приложение
 * */

public class TaxiApplication {
    public static void main(String[] args) {


        TaxiOrder order1 = new TaxiOrder();
        SoberDriverOrder order2 = new SoberDriverOrder();

        order1.executeOrder();
        System.out.println("\n========================================\n");
        order2.executeOrder();
    }
}
