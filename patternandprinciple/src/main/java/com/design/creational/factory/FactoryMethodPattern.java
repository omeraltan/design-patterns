package com.design.creational.factory;

/**
 *
 * Factory Method Design Pattern ile ilgili detaylı bir örnek yapalım.
 * Factory Method, nesne oluşturma sorumluluğunu alt sınıflara devreden bir yaratıcı tasarım desenidir.
 * Bu desen, bir arayüz veya soyut sınıf içerisinde tanımlanmış bir factory metodu kullanarak,
 * nesne oluşturma sürecini soyutlar.
 *
 */

interface Animal {
    void speak();
}

class Lion implements Animal {
    @Override
    public void speak() {
        System.out.println("Lion roars");
    }
}

class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("Tiger growls");
    }
}

class Elephant implements Animal {
    @Override
    public void speak() {
        System.out.println("Elephant trumpets");
    }
}

abstract class AnimalFactory {

    // Factory methodu
    public abstract Animal createAnimal();

    // Bir şablon method
    public void makeAnimalSpeak() {
        Animal animal = createAnimal();
        animal.speak();
    }
}

class LionFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Lion();
    }
}

class TigerFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}

class ElephantFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Elephant();
    }
}


public class FactoryMethodPattern {

    public static void main(String[] args) {

        // Lion oluşturma ve konuşturma
        AnimalFactory lionFactory = new LionFactory();
        lionFactory.makeAnimalSpeak();  // Çıktı: Lion roars

        // Tiger oluşturma ve konuşturma
        AnimalFactory tigerFactory = new TigerFactory();
        tigerFactory.makeAnimalSpeak();  // Çıktı: Tiger growls

        // Elephant oluşturma ve konuşturma
        AnimalFactory elephantFactory = new ElephantFactory();
        elephantFactory.makeAnimalSpeak();  // Çıktı: Elephant trumpets

    }

}
