package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String userName = "Willy";
        //userName = "John";
        String[] nameparts = userName.split(" ");
        System.out.println("Firstname " + nameparts[0]);
        System.out.println("Lastname " + nameparts[1]);
    }
}
