package com.design.creational.singleton;

public class SingletonExample {

    private static SingletonExample instance;

    private SingletonExample() {

    }
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World from Singleton");
    }

    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();

        singleton.showMessage();
    }
}
