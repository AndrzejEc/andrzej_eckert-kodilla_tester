package com.kodilla.inheritance;

public class Convertible extends Car {
    public Convertible(int wheels, int seats){
        super(wheels,seats);
        System.out.println("Convertible construtor");
    }
    public void openRoof(){
        System.out.println("Opening roof...");
    }

    public void closeRoof(){
        System.out.println("Closing roof...");
    }

    @Override
    public void openDoors(){
        System.out.println("Openinf 2 doors..");
    }




}
