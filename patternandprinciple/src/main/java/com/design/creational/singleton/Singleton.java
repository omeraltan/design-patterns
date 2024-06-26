package com.design.creational.singleton;

/**
 *      SINGLETON
 *      It ensures that only one instance of a class is created and provides a global access point to that instance.
 */

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("I am a singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
