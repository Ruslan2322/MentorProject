package com.company.practice.builder;

public class Rifle {
    private String name;
    private OpticSystem optic;
    private Mechanism mechanism;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setOptic(OpticSystem optic) {
        this.optic = optic;
    }

    public void setMechanism(Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rifle{" +
                "name='" + name + '\'' +
                ", optic=" + optic +
                ", mechanism=" + mechanism +
                ", price=" + price +
                '}';
    }
}
