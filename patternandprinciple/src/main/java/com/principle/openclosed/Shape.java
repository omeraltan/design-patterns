package com.principle.openclosed;

public abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    public double length;
    public double width;

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {

    public double length = 4;
    public double width = 6;

    @Override
    double calculateArea() {
        return (0.5)*(length*width);
    }
}

class Square extends Shape {

    public double length = 4;
    public double width  = 4;

    @Override
    double calculateArea() {
        return length*width;
    }
}

//class Circle extends Shape {
//
//    @Override
//    double calculateArea() {
//        return 0;
//    }
//}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

class TestShapes{

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateArea(new Square()));
    }
}
