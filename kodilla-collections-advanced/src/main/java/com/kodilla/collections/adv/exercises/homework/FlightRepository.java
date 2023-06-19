package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    List<Flight> flights = new ArrayList<>();

    public void addFlight(String departure, String arrival) {
        Flight flight = new Flight(departure,arrival);
        flights.add(flight);
    }
    public List<Flight> getFlightsTable() {
        return flights;
    }
    public int size(){
        return flights.size();
    }
}
