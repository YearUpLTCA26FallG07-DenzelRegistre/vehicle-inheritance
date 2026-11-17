package com.pluralsight;

public class Car extends Vehicle{
    private int vin;

    public Car(String color, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, model, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.vin = vin;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
}
