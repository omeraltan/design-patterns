package com.design.creational.factory;

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

    // Factory metodu
    public abstract Animal createAnimal();

    // Bir şablon metot
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


public class FactoryMethodDesignPattern {

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