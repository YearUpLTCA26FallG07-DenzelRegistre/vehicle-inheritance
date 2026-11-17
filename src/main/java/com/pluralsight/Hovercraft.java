package com.pluralsight;

public class Hovercraft extends Vehicle{
    private String hin;

    public Hovercraft(String color, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String hin) {
        super(color, model, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hin = hin;
    }
}
