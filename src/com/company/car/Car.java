package com.company.car;

public abstract class Car {
    private boolean isSedan;
    private String seats;
    private String mileage;

    public Car(boolean isSedan, String seats, String mileage) {
        this.isSedan = isSedan;
        this.seats = seats;
        this.mileage = mileage;
    }

    public boolean isSedan() {
        return isSedan;
    }

    public String getSeats() {
        return seats;
    }

    public String getMileage() {
        return mileage;
    }

    public abstract String getMileageString();

}
