package com.designpatterns.creational.abstractfactory;

/**
 *      BUILDER
 *      It offers a structure that builds the process of creating complex objects step by step.
 */

public class Product {
    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }
    public void setPartC(String partC) { this.partC = partC; }
}

abstract class Builder {
    protected Product product = new Product();

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    Product getResult() {
        return product;
    }
}

class ConcreteBuilder extends Builder {
    void buildPartA() {
        product.setPartA("Part A");
    }
    void buildPartB() {
        product.setPartB("Part B");
    }
    void buildPartC() {
        product.setPartC("Part C");
    }
}

class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
