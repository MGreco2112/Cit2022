package com.company.car;

public class HondaCity extends Car{

    public HondaCity(String mileage) {
        super(true, "4", mileage);
    }

    public String getMileageString() {
        return getMileage() + " kmph";
    }

    @Override
    public String toString() {
        return "A Honda City is " + (isSedan() ? "" : " not ") + " a Sedan, has " + getSeats() +
                " seats, and has a mileage of around " + getMileageString();
    }
}
