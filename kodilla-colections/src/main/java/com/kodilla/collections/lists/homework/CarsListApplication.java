package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford());
        cars.add(new Ford());
        cars.add(new Opel());
        Car opel2 = new Opel();
        cars.add(opel2);
        cars.add(new Porsche());
        cars.add(new Porsche());

        System.out.println("Collection size: " + cars.size());
        for (Car car: cars)
            CarUtils.describeCar(car);

        cars.remove(1);
        cars.remove(opel2);

        System.out.println("Collection size: " + cars.size());
        for (Car car: cars)
            CarUtils.describeCar(car);

    }
}
