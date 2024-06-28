package com.design.creational.singleton;

/**
 *
 * Singleton Design Pattern, bir sınıfın yalnızca bir örneğinin oluşturulmasını sağlar
 * ve bu örneğe global bir erişim noktası sunar. Singleton, genellikle belirli bir kaynağın
 * veya servisin tek bir örnekle yönetilmesi gerektiği durumlarda kullanılır.
 *
 */

public class BasicPattern {

    private static BasicPattern instance;

    private BasicPattern() {
        System.out.println("I am a singleton");
    }

    public static BasicPattern getInstance() {
        if (instance == null) {
            instance = new BasicPattern();
        }
        return instance;
    }
}
