package com.company.practice.decorator;

public class Seller implements Sale {
    @Override
    public String sellProduct() {
        return "Seller sales product...";
    }
}
