package com.barchenko.patterns.generating.singleton;

import com.barchenko.patterns.generating.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;

        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
