package com.company;

import com.company.car.Car;
import com.company.car.HondaCity;
import com.company.car.InnovaCrysta;
import com.company.car.WagonR;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(LastAndSecondLast.reverse("bat"));
//        FizzBuzz.fizzBuzz(15);
        Car wagon = new WagonR("22");
        Car honda = new HondaCity("17");
        Car innova = new InnovaCrysta("25");

        System.out.println(wagon);
        System.out.println(honda);
        System.out.println(innova);
    }
}
