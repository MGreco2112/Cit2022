package com.company.car;

public class InnovaCrysta extends Car{

    public InnovaCrysta(String mileage) {
        super(false, "6", mileage);
    }

    public String getMileageString() {
        return getMileage() + " kmph";
    }

    @Override
    public String toString() {
        return "An Innova Crysta is " + (isSedan() ? "" : " not ") + " a Sedan, has " + getSeats() +
                " seats, and has a mileage of around " + getMileageString();
    }
}
