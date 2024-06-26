package com.design.creational.builder;

public class HomeBuilder {

    private String city;
    private String district;
    private String street;

    private int buildingYear;
    private int balconyAmount;
    private int roomAmount;
    private int bathroomAmount;
    private int toiletAmount;

    private boolean isDublex;
    private boolean isFurniture;
    private boolean hasCarPark;
    private boolean hasChildPark;
    private boolean hasAirConditioner;
    private boolean hasPool;

    public static HomeBuilder startBuild() {
        return new HomeBuilder();
    }

    public Home build(){
        Home home = new Home();


        home.setCity(city);
        home.setDistrict(district);
        home.setStreet(street);

        home.setBuildingYear(buildingYear);
        home.setBalconyAmount(balconyAmount);
        home.setRoomAmount(roomAmount);
        home.setBathroomAmount(bathroomAmount);
        home.setToiletAmount(toiletAmount);

        home.setDublex(isDublex);
        home.setFurniture(isFurniture);
        home.setHasCarPark(hasCarPark);
        home.setHasChildPark(hasChildPark);
        home.setHasAirConditioner(hasAirConditioner);
        home.setHasPool(hasPool);
        return home;
    }

    public HomeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HomeBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public HomeBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public HomeBuilder setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
        return this;
    }

    public HomeBuilder setBalconyAmount(int balconyAmount) {
        this.balconyAmount = balconyAmount;
        return this;
    }

    public HomeBuilder setRoomAmount(int roomAmount) {
        this.roomAmount = roomAmount;
        return this;
    }

    public HomeBuilder setBathroomAmount(int bathroomAmount) {
        this.bathroomAmount = bathroomAmount;
        return this;
    }

    public HomeBuilder setToiletAmount(int toiletAmount) {
        this.toiletAmount = toiletAmount;
        return this;
    }

    public HomeBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public HomeBuilder setFurniture(boolean furniture) {
        isFurniture = furniture;
        return this;
    }

    public HomeBuilder setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public HomeBuilder setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
        return this;
    }

    public HomeBuilder setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        return this;
    }

    public HomeBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
