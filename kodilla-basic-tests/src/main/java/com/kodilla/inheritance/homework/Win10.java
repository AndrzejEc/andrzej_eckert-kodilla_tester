package com.kodilla.inheritance.homework;

public class Win10 extends OperatingSystem{
    private int year;

    public Win10(int year){
        super(year);
        this.year=year;
    }
    @Override
    public void turnOn(){
        System.out.println("System Win10 from " + this.year+" is ON");
    }
}
