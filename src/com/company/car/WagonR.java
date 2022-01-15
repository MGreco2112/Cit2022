package com.company.car;

public class WagonR extends Car{

    public WagonR(String mileage) {
        super(false, "4", mileage);
    }

    @Override
    public String getMileageString() {
        return getMileage() + " kmph";
    }

    @Override
    public String toString() {
        return "A Wagon R is " + (isSedan() ? "" : " not ") + " a Sedan, has " + getSeats() +
                " seats, and has a mileage of around " + getMileageString();
    }
}
