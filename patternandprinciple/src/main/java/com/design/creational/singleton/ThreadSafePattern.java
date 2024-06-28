package com.design.creational.singleton;

/**
 *
 * Aynı anda birden fazla iş parçacığı getInstance metodunu çağırabilir ve bu durumda
 * birden fazla örnek oluşturulabilir.
 * Bu durumu önlemek için synchronized anahtar kelimesini kullanarak thread-safe
 * bir BasicPattern sınıfı oluşturabiliriz.
 *
 */

public class ThreadSafePattern {

    private static ThreadSafePattern instance;

    private ThreadSafePattern() {

    }

    public static synchronized ThreadSafePattern getInstance() {
        if (instance == null) {
            instance = new ThreadSafePattern();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World from ThreadSafePattern!");
    }

    public static void main(String[] args) {
        ThreadSafePattern singleton = ThreadSafePattern.getInstance();
        singleton.showMessage();
    }
}
