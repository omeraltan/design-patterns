package com.design.creational.abstractfactory;

/**
 *
 * Abstract Factory Design Pattern ile ilgili detaylı bir inceleme yapalım.
 * Abstract Factory Design Pattern, birbiriyle ilişkili veya bağımlı nesnelerin bir ailesini oluşturmak için kullanılır.
 * Bu desen, nesne oluşturma sürecini soyut bir fabrika arayüzü üzerinden yönetir ve istemciler,
 * bu fabrikayı kullanarak nesneleri oluşturur.
 *
 */

// Chair arayüzü
interface Chair {
    void sitOn();
}

// Sofa arayüzü
interface Sofa {
    void lieOn();
}

// CoffeeTable arayüzü
interface CoffeeTable {
    void placeItem();
}

// Modern Chair sınıfı
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }
}

// Viktorya Chair sınıfı
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a victorian chair");
    }
}

// Modern Sofa sınıfı
class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa");
    }
}

// Viktorya Sofa sınıfı
class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a victorian sofa");
    }
}

// Modern CoffeeTable sınıfı
class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void placeItem() {
        System.out.println("Placing item on a modern coffee table");
    }
}

// Viktorya CoffeeTable sınıfı
class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void placeItem() {
        System.out.println("Placing item on a victorian coffee table");
    }
}

interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}

// Modern Furniture Factory sınıfı
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

// Viktorya Furniture Factory sınıfı
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}



public class AbstractFactoryPattern {

    public static void main(String[] args) {
        // Modern mobilya seti oluşturma
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernTable = modernFactory.createCoffeeTable();

        modernChair.sitOn();  // Çıktı: Sitting on a modern chair
        modernSofa.lieOn();   // Çıktı: Lying on a modern sofa
        modernTable.placeItem(); // Çıktı: Placing item on a modern coffee table

        // Viktorya mobilya seti oluşturma
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianTable = victorianFactory.createCoffeeTable();

        victorianChair.sitOn();  // Çıktı: Sitting on a victorian chair
        victorianSofa.lieOn();   // Çıktı: Lying on a victorian sofa
        victorianTable.placeItem(); // Çıktı: Placing item on a victorian coffee table
    }

}
