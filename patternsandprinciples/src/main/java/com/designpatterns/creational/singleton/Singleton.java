package com.designpatterns.creational.singleton;

/**
 *      SINGLETON
 *      It ensures that only one instance of a class is created and provides a global access point to that instance.
 */

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}