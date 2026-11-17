package com.pluralsight;

public class Moped extends Vehicle{
    private int vin;

    public Moped(String color, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int vin) {
        super(color, model, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.vin = vin;
    }
}
