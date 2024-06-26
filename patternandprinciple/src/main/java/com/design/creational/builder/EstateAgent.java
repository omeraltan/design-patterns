package com.design.creational.builder;

public class EstateAgent {

    public static void main(String[] args) {
        Home home = new Home();
        home.setCity("İstanbul");
        home.setDistrict("YeniBosna");
        home.setStreet("Saraycık");
        home.setRoomAmount(3);
        home.setBuildingYear(2010);
        home.setHasAirConditioner(true);

        Home home2 = new Home("Ankara","Sincan","Topçu", 2022,1,3,1,2,false,false,true,true,false,false);
        printHome(home);
        printHome(home2);
    }

    private static void printHome(Home home){
        System.out.println();
        System.out.println("Ev eklendi -> " + home);
        System.out.println();
    }

}
