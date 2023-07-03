package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirPortRepository airPortRepository = new AirPortRepository();
        boolean isVienaInUse = false;
        try {
            isVienaInUse = airPortRepository.isAirportInUse("Viena");
            System.out.println("Viena ststus: " + isVienaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by our airlines");
        } finally {
            System.out.println("Thank you for using Kodilla Airlines");
        }
    }
}
