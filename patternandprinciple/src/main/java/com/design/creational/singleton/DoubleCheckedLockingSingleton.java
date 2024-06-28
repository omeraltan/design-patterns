package com.design.creational.singleton;

/**
 *
 * - Double-Checked Locking Singleton -
 * Thread-safe bir Singleton oluştururken synchronized anahtar kelimesi kullanmak,
 * performans açısından maliyetli olabilir.
 * Double-checked locking ile bu maliyeti azaltabiliriz.
 *
 * Neden Double-Checked Locking Kullanılır?
 * Performans Optimizasyonu: İlk kontrol (synchronized blok dışında) ve ikinci kontrol (synchronized blok içinde) sayesinde,
 * synchronized blok sadece instance gerçekten null olduğunda çalıştırılır.
 * Bu, synchronized bloğun gereksiz yere çalıştırılmasını ve performans maliyetini azaltır.
 * Thread-Safety: Synchronized blok sayesinde, birden fazla iş parçacığı aynı anda instance oluşturamaz,
 * bu da Singleton örneğinin güvenli bir şekilde oluşturulmasını sağlar.
 *
 */

public class DoubleCheckedLockingSingleton {

    // Volatile anahtar kelimesi ile değişkenin farklı iş parçacıkları arasında tutarlı kalmasını sağla
    private static volatile DoubleCheckedLockingSingleton instance;

    // Private constructor, sınıfın dışından doğrudan erişimi engeller
    private DoubleCheckedLockingSingleton() {

    }

    // Singleton örneğini döndüren public static metod
    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }

    // Örnek bir metod
    public void showMessage() {
        System.out.println("Hello World from DoubleCheckedLockingSingleton!");
    }

    // Test için main metod
    public static void main(String[] args) {
        // Singleton örneğini al ve metodunu çağır
        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
        singleton.showMessage();
    }

    /**
     *
     * Basit Singleton: Tek bir örnek oluşturur, ancak çoklu iş parçacığı ortamlarında güvenli değildir.
     * Thread-Safe Singleton: Synchronized anahtar kelimesi ile thread-safe hale getirilir, ancak performans maliyeti olabilir.
     * Double-Checked Locking Singleton: Performansı optimize ederek thread-safe bir Singleton sağlar.
     *
     */

}
