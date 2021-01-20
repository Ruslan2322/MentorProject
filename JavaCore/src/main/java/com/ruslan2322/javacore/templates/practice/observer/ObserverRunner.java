package com.company.practice.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        Celebrity kianka = new Celebrity("Kianu Rivs");
        Celebrity galenkin = new Celebrity("Sergey Galenkin");

        Follower dan = new Follower("Dan");
        Follower jim = new Follower("Jimmy");
        Follower jorge = new Follower("Jorge");
        Follower yohan = new Follower("Yohhan");
        Follower peter = new Follower("Peter");

        kianka.register(dan);
        kianka.register(jim);
        kianka.register(jorge);

        kianka.tweet("Hey guys i didn't know something about CyberPunk2077 technical condition... ");
        kianka.unregister(jim);

        galenkin.tweet("Guys in this year , we will give you more freebie!!! Our company is the great equalizer of Game industry!!!  ");
        galenkin.register(dan);
        galenkin.register(jim);
        galenkin.register(jorge);
        galenkin.register(yohan);
        galenkin.register(peter);
    }

}
