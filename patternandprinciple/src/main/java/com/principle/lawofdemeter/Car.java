package com.principle.lawofdemeter;

/**
 *      Law of Demeter - LoD
 */

// Bad Example
public class Car {
    private Engine engine;

    public void start() {
        engine.getFuelInjector().inject();
    }
}

// Good Example
class Car2 {
    private Engine engine;

    public void start() {
        engine.start();
    }
}

class Engine {
    private FuelInjector fuelInjector;

    public void start() {
        fuelInjector.inject();
    }

    public FuelInjector getFuelInjector() {
        return fuelInjector;
    }
}

class FuelInjector {
    public void inject() {
        System.out.println("FuelInjector injected");
    }
}
