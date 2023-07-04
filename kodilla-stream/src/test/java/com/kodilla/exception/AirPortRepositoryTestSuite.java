package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirPortRepositoryTestSuite {
    @Test
    public void testIsAirPortInUse() throws AirportNotFoundException{
        //given
        AirPortRepository airPortRepository = new AirPortRepository();
        //when
        boolean isWarsawInUse = airPortRepository.isAirportInUse("Warsaw");
        //then
        assertTrue(isWarsawInUse);
    }
    @Test
    public void testIsAirportInUse_withException(){
        //given
        AirPortRepository airPortRepository = new AirPortRepository();
        //when
        //then
        assertThrows(AirportNotFoundException.class, ()->airPortRepository.isAirportInUse("Vienna"));
    }
}