package com.designpatterns.creational.builder;

public class NewEstateAgent {

    public static void main(String[] args) {
        Home home1 = HomeBuilder.startBuild()
            .setCity("Istanbul")
            .setDistrict("YeniBosna")
            .setStreet("Topcu")
            .setBuildingYear(2008)
            .setRoomAmount(3)
            .setHasChildPark(true)
            .setHasCarPark(true)
            .build();

        System.out.println(home1);
    }

    private static void printHome(Home home){
        System.out.println();
        System.out.println("Ev eklendi -> " + home);
        System.out.println();
    }
}
