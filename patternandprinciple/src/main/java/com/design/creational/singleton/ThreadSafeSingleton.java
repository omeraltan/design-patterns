package com.design.creational.singleton;

/**
 *
 * - Thread-Safe Singleton -
 * Aynı anda birden fazla iş parçacığı getInstance metodunu çağırabilir ve bu durumda birden fazla örnek oluşturulabilir.
 * Bu durumu önlemek için synchronized anahtar kelimesini kullanarak thread-safe bir Singleton sınıfı oluşturabiliriz.
 *
 */

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World from ThreadSafeSingleton!");
    }

    public static void main(String[] args) {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        singleton.showMessage();
    }
}
