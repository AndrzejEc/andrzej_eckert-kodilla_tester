package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1998);
        operatingSystem.turnOn();

        XP xp = new XP(2001);
        xp.turnOn();

        Win10 win10 = new Win10(2015);
        win10.turnOn();

    }
}
