package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Opel opel = new Opel();
        Porsche porsche = new Porsche();
        doRace(ford);
        doRace(opel);
        doRace(porsche);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
