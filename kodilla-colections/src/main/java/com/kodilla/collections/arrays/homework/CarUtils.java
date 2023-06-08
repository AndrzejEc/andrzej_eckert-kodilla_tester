package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porsche;

public class CarUtils {

    public static void describeCar (Car car){
        if (car instanceof Ford)
            System.out.println("Ford (speed: " + car.getSpeed() + ")");
        else if (car instanceof Opel)
            System.out.println("Opel (speed: " + car.getSpeed() + ")");
        else if (car instanceof Porsche)
            System.out.println("Porsche (speed: " + car.getSpeed() + ")");
        else
            System.out.println("Unknown car");
    }
}
