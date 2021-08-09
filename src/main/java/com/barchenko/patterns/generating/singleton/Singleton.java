package com.barchenko.patterns.generating.singleton;

public class Singleton {

    public static final Singleton INSTANCE = new Singleton("test", 1);
    private String name;
    private int age;

    private Singleton(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
