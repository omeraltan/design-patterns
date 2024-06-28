package com.design.creational.singleton;

/**
 *
 * Thread-safe bir BasicPattern oluştururken synchronized anahtar kelimesi kullanmak,
 * performans açısından maliyetli olabilir.
 * Double-checked locking ile bu maliyeti azaltabiliriz.
 *
 * Neden Double-Checked Locking Kullanılır?
 * Performans Optimizasyonu: İlk kontrol (synchronized blok dışında) ve ikinci kontrol (synchronized blok içinde) sayesinde,
 * synchronized blok sadece instance gerçekten null olduğunda çalıştırılır.
 * Bu, synchronized bloğun gereksiz yere çalıştırılmasını ve performans maliyetini azaltır.
 * Thread-Safety: Synchronized blok sayesinde, birden fazla iş parçacığı aynı anda instance oluşturamaz,
 * bu da BasicPattern örneğinin güvenli bir şekilde oluşturulmasını sağlar.
 *
 */

public class DoubleCheckedLockingPattern {

    // Volatile anahtar kelimesi ile değişkenin farklı iş parçacıkları arasında tutarlı kalmasını sağla
    private static volatile DoubleCheckedLockingPattern instance;

    // Private constructor, sınıfın dışından doğrudan erişimi engeller
    private DoubleCheckedLockingPattern() {

    }

    // BasicPattern örneğini döndüren public static metod
    public static DoubleCheckedLockingPattern getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingPattern.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingPattern();
                }
            }
        }
        return instance;
    }

    // Örnek bir metod
    public void showMessage() {
        System.out.println("Hello World from DoubleCheckedLockingPattern!");
    }

    // Test için main metod
    public static void main(String[] args) {
        // BasicPattern örneğini al ve metodunu çağır
        DoubleCheckedLockingPattern singleton = DoubleCheckedLockingPattern.getInstance();
        singleton.showMessage();
    }

    /**
     *
     * Basit BasicPattern: Tek bir örnek oluşturur, ancak çoklu iş parçacığı ortamlarında güvenli değildir.
     * Thread-Safe BasicPattern: Synchronized anahtar kelimesi ile thread-safe hale getirilir, ancak performans maliyeti olabilir.
     * Double-Checked Locking BasicPattern: Performansı optimize ederek thread-safe bir BasicPattern sağlar.
     *
     */

}
