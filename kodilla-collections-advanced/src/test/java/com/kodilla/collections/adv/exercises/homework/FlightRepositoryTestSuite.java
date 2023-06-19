package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightRepositoryTestSuite {

    @Test
    void addFlightsToTable() {
        //given
        FlightRepository flightRepository = new FlightRepository();
        //when
        flightRepository.addFlight("A", "B");
        flightRepository.addFlight("c", "d");
        //then
        assertEquals(2, flightRepository.size());
    }

}