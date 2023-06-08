package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car :cars)
            CarUtils.describeCar(   car);
    }
    public static Car drawCar(){
        Random random = new Random();

        int volSpeed;
        int drawCarKind = random.nextInt(3);
        if (drawCarKind == 0){
            Ford ford = new Ford();
            randomSpeedUp(ford);
            return ford;
        }
        else if (drawCarKind == 1) {
            Opel opel = new Opel();
            randomSpeedUp(opel);
            return opel;
        }
        else if (drawCarKind == 2) {
            Porsche porsche = new Porsche();
            randomSpeedUp(porsche);
            return porsche;
        }
        else
            return null;
    }
    public static Car randomSpeedUp(Car car){
        int i = 0;
        int volSpeed;
        Random random = new Random();
        volSpeed = random.nextInt(11);
        car.increaseSpeed();
        while (i < volSpeed){
            car.increaseSpeed();
            i ++;
        }
        return car;
    }
}
