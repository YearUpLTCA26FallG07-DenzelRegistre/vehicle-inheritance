package com.pluralsight;

public class Car extends Vehicle{
    private int vin;

    public Car(String color, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int vin) {
        super(color, model, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.vin = vin;
    }
}
