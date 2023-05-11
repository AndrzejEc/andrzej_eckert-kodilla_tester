package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;
    public OperatingSystem(int year){
        this.year = year;
    }

    public void turnOn(){
        System.out.println("System from "+ this.year +" is ON");
    }
    public void turnOff(){
        System.out.println("System is OFF");
    }

    public int getYear(){
        return year;
    }
}
