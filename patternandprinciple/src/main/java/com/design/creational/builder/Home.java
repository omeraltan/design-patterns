package com.design.creational.builder;

public class Home {

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

    public Home() {
    }

    public Home(String city, String district, String street, int buildingYear, int balconyAmount, int roomAmount) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.buildingYear = buildingYear;
        this.balconyAmount = balconyAmount;
        this.roomAmount = roomAmount;
    }

    public Home(String city, String district, String street, int buildingYear, int balconyAmount, int roomAmount, int bathroomAmount, int toiletAmount, boolean isDublex, boolean isFurniture, boolean hasCarPark, boolean hasChildPark, boolean hasAirConditioner, boolean hasPool) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.buildingYear = buildingYear;
        this.balconyAmount = balconyAmount;
        this.roomAmount = roomAmount;
        this.bathroomAmount = bathroomAmount;
        this.toiletAmount = toiletAmount;
        this.isDublex = isDublex;
        this.isFurniture = isFurniture;
        this.hasCarPark = hasCarPark;
        this.hasChildPark = hasChildPark;
        this.hasAirConditioner = hasAirConditioner;
        this.hasPool = hasPool;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
    }

    public int getBalconyAmount() {
        return balconyAmount;
    }

    public void setBalconyAmount(int balconyAmount) {
        this.balconyAmount = balconyAmount;
    }

    public int getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(int roomAmount) {
        this.roomAmount = roomAmount;
    }

    public int getBathroomAmount() {
        return bathroomAmount;
    }

    public void setBathroomAmount(int bathroomAmount) {
        this.bathroomAmount = bathroomAmount;
    }

    public int getToiletAmount() {
        return toiletAmount;
    }

    public void setToiletAmount(int toiletAmount) {
        this.toiletAmount = toiletAmount;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isFurniture() {
        return isFurniture;
    }

    public void setFurniture(boolean furniture) {
        isFurniture = furniture;
    }

    public boolean isHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public boolean isHasChildPark() {
        return hasChildPark;
    }

    public void setHasChildPark(boolean hasChildPark) {
        this.hasChildPark = hasChildPark;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "Home{" +
            "city='" + city + '\'' +
            ", district='" + district + '\'' +
            ", street='" + street + '\'' +
            ", buildingYear=" + buildingYear +
            ", balconyAmount=" + balconyAmount +
            ", roomAmount=" + roomAmount +
            ", bathroomAmount=" + bathroomAmount +
            ", toiletAmount=" + toiletAmount +
            ", isDublex=" + isDublex +
            ", isFurniture=" + isFurniture +
            ", hasCarPark=" + hasCarPark +
            ", hasChildPark=" + hasChildPark +
            ", hasAirConditioner=" + hasAirConditioner +
            ", hasPool=" + hasPool +
            '}';
    }
}
