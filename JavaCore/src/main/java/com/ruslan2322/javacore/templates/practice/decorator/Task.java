package com.company.practice.decorator;

public class Task {
    public static void main(String[] args) {

        Sale sale = new Seller();
        Sale seiorSale = new SeniorSeller(new Seller());
        Sale manager = new SeniorSeller(new SeniorSeller(new Seller()));

        System.out.println(sale.sellProduct());
        System.out.println(seiorSale.sellProduct());
        System.out.println(manager.sellProduct());
    }
}
