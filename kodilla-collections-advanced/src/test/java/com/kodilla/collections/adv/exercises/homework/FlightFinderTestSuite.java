package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
        //given
        FlightRepository flightRepository = new FlightRepository();
        flightRepository.addFlight("A", "B");
        flightRepository.addFlight("c", "d");
        flightRepository.addFlight("c", "d");
        //when
        FlightFinderTestSuite flightFinder;
        List<Flight> result = flightFinder.findFlightsFrom("A");
        //then
        assertEquals(2, flightRepository.size());

    }

    @Test
    void findFlightsTo() {
    }
}