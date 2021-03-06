package com.company.practice.builder;

/**
 * Программа компановки винтовок на сайте
 * */

public class BuildGunRunner {
    public static void main(String[] args) {
        GunCreator gunCreator = new GunCreator();

        gunCreator.setBuilder(new SniperRifleBuilder());

        Rifle rifle = gunCreator.buildRifle();

        System.out.println(rifle);
    }
}
