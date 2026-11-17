package com.pluralsight;

public class Hovercraft extends Vehicle{
    private String hin;

    public Hovercraft(String color, String model, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, model, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hin = hin;
    }

    public String getHin() {
        return hin;
    }

    public void setHin(String hin) {
        this.hin = hin;
    }


}
