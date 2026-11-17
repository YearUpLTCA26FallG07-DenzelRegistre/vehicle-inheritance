package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Red","Ford",5,15,14);

        Moped moped = new Moped("Blue","Vespa", 2,250,1);

        SemiTruck semiTruck = new SemiTruck("White", "Freightliner", 18, 80000, 10);

        Car car = new Car("Red","Ford",5,15,14);

        Hovercraft hovercraft = new Hovercraft("White","Griffon Hoverwork",14,2000,119);
        hovercraft.setHin("ABC3920134");

        String NoP = String.valueOf(hovercraft.getNumberOfPassengers());
        String hovercraftinfo = (hovercraft.getColor() + hovercraft.getModel() + NoP);

        System.out.println(hovercraftinfo);


    }
}