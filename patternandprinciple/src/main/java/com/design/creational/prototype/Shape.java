package com.design.creational.prototype;

import java.util.Hashtable;

public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

class PrototypeManager {
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}

class PrototypePatternDemo {

    public static void main(String[] args) {
        PrototypeManager.loadCache();

        Shape clonedShape1 = (Shape) PrototypeManager.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = (Shape) PrototypeManager.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();
    }

}
