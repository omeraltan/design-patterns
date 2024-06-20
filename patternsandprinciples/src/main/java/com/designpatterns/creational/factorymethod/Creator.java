package com.designpatterns.creational.factorymethod;

/**
 *      FACTORY METHOD
 *      It provides an interface that delegates object creation to subclasses.
 */

abstract class Product {
    abstract void use();
}

class ConcreteProductA extends Product {
    void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB extends Product {
    void use() {
        System.out.println("Using Product B");
    }
}

public abstract class Creator {
    abstract Product factoryMethod();

    void anOperation() {
        Product product = factoryMethod();
        product.use();
    }
}

class ConcreteCreatorA extends Creator {
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}

