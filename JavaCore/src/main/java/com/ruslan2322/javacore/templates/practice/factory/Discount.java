package com.company.practice.factory;

public enum Discount {
    STD(0.15),
    WRK(0),
    PEN(0.5);

    double discount;

    Discount(double discount){
        this.discount = discount;
    }
}
