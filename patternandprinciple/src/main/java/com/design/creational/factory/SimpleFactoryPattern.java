package com.design.creational.factory;

/**
 *
 * Simple Factory Design Pattern ile ilgili detaylı bir örnek yapalım.
 * Simple Factory, nesne oluşturma sorumluluğunu merkezi bir sınıfta toplar ve bu sınıf,
 * belirli kriterlere göre nesneleri oluşturur. Simple Factory Design Pattern genellikle
 * bir statik metod kullanarak nesne oluşturma işlemini gerçekleştirir.
 *
 */

interface Vehicle{
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorcycle");
    }
}

class VehicleFactory {
    // Factory metodu
    public static Vehicle createVehicle(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type) {
            case "Car":
                return new Car();
            case "Truck":
                return new Truck();
            case "Motorcycle":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}

public class SimpleFactoryPattern {

    public static void main(String[] args) {
        // Car oluşturma
        Vehicle car = VehicleFactory.createVehicle("Car");
        car.drive();  // Çıktı: Driving a car

        // Truck oluşturma
        Vehicle truck = VehicleFactory.createVehicle("Truck");
        truck.drive();  // Çıktı: Driving a truck

        // Motorcycle oluşturma
        Vehicle motorcycle = VehicleFactory.createVehicle("Motorcycle");
        motorcycle.drive();  // Çıktı: Riding a motorcycle
    }

}
