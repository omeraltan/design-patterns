package com.designpatterns.creational.abstractfactory;

public interface Phone {
    String getModel();
    String getBattery();
    int getLength();
    int getWidth();
}

interface PhoneFactory{
    Phone getPhone(String model, String battery, int length, int width);
}

class S8Factory implements PhoneFactory{

    @Override
    public Phone getPhone(String model, String battery, int length, int width) {
        return new S8(model, battery, length, width);
    }
}

class Note8Factory implements PhoneFactory{

    @Override
    public Phone getPhone(String model, String battery, int length, int width) {
        return new Note8(model, battery, length, width);
    }
}

class S8 implements Phone {
    private String model;
    private String battery;
    private int length;
    private int width;

    public S8(String model, String battery, int length, int width) {
        this.model = model;
        this.battery = battery;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "S8{" +
            "model='" + model + '\'' +
            ", battery='" + battery + '\'' +
            ", length=" + length +
            ", width=" + width +
            '}';
    }
}

class Note8 implements Phone {

    private String model;
    private String battery;
    private int length;
    private int width;

    public Note8(String model, String battery, int length, int width) {
        this.model = model;
        this.battery = battery;
        this.length = length;
        this.width = width;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Note8{" +
            "model='" + model + '\'' +
            ", battery='" + battery + '\'' +
            ", length=" + length +
            ", width=" + width +
            '}';
    }
}



class PhoneStore{

    public static void main(String[] args) {

        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("S8", "2600mAh", 4, 7);

        Note8Factory note8Factory = new Note8Factory();
        Phone note8 = note8Factory.getPhone("Note8", "3000mAh", 5, 8);

        System.out.println(s8.toString());
        System.out.println(note8.toString());
    }

}
