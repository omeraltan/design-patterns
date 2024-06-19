package com.principles.compositionoverinheritance;

/**
 *       Composition Over Inheritance
 */

// Good Example
interface Drawable {
    void draw();
}

interface Colorable {
    void color();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class RedColor implements Colorable {
    @Override
    public void color() {
        System.out.println("Drawing RedColor");
    }
}

class BlueColor implements Colorable {
    @Override
    public void color() {
        System.out.println("Drawing BlueColor");
    }
}

class Shape {
    private Drawable drawable;
    private Colorable colorable;

    public Shape(Drawable drawable, Colorable colorable) {
        this.drawable = drawable;
        this.colorable = colorable;
    }

    public void draw() {
        drawable.draw();
    }

    public void color() {
        colorable.color();
    }
}

public class ShapeComposition {

    public static void main(String[] args) {
        Drawable rectangle = new Rectangle();
        Colorable redColor = new RedColor();

        Shape redRectangle = new Shape(rectangle, redColor);
        redRectangle.draw();
        redRectangle.color();

        System.out.println("--------------");

        Drawable circle = new Circle();
        Colorable blueColor = new BlueColor();

        Shape blueCircle = new Shape(circle, blueColor);
        blueCircle.draw();
        blueCircle.color();
    }

}
