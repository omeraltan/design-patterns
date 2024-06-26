package com.design.creational.factorymethod;

public interface Phone {
    String getModel();
    String getBattery();
    int getLength();
    int getWidth();

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

class PhoneFactory{

    public static Phone getPhone(String model, String battery, int length, int width){
        Phone phone;
        if(model.equalsIgnoreCase("S8")){
            phone = new S8(model, battery, length, width);
        }
        else if(model.equalsIgnoreCase("Note8")){
            phone = new Note8(model, battery, length, width);
        }
        else {
            throw new RuntimeException("Unsupported model: " + model);
        }
        return phone;
    }

}

class PhoneStore{

    public static void main(String[] args) {
        Phone phone = PhoneFactory.getPhone("S8", "2600mah", 10, 20);
        System.out.println(phone);
        Phone phone2 = PhoneFactory.getPhone("Note8", "3000mah", 5, 8);
        System.out.println(phone2);
    }

}
