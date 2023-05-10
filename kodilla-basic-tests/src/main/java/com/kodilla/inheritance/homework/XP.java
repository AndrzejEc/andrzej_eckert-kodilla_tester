package com.kodilla.inheritance.homework;

public class XP extends OperatingSystem{
    private int year;
    public XP(int year) {
        super(year);
        this.year =  year;
    }

    @Override
    public void turnOn(){
        System.out.println("System XP from " + this.year + " is ON");
    }
}
