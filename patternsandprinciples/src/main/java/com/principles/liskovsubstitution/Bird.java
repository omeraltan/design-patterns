package com.principles.liskovsubstitution;

public class Bird {
    public void eat(){
        System.out.println("Bird is eating");
    }
}

class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Bird flying");
    }
}

class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Bird flying");
    }
}

class Ostrich extends Bird{
    @Override
    public void eat() {
        System.out.println("Ostrich Bird eating");
    }
}
