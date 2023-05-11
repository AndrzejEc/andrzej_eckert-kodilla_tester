package com.kodilla.inheritance.homework;

public class XP extends OperatingSystem{

    public XP(int year) {
        super(year);
    }

    @Override
    public void turnOn(){
        System.out.println("System XP from " + getYear() + " is ON");
    }
}
