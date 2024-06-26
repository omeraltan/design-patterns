package com.principle.dependencyinversion;

interface Switchable {
    void turnOn();
    void turnOff();
}

class LightBulb implements Switchable {
    public void turnOn() {
        System.out.println("Open the LightBulb");
    }

    public void turnOff() {
        System.out.println("Close the LightBulb");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Open the Fan");
    }

    public void turnOff() {
        System.out.println("Close the Fan");
    }
}

public class Switch {

    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {

    }
}
