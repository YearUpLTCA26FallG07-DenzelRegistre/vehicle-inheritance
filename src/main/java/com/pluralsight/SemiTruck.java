package com.pluralsight;

public class SemiTruck extends Vehicle{
    private int vin;

    public SemiTruck(String color, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int vin) {
        super(color, model, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.vin = vin;
    }
}
