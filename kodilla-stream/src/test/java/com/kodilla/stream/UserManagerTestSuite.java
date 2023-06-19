package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//import static com.kodilla.stream.UserManager.filterChemistGroupUsernames;
//import static com.kodilla.stream.UserManager    ;
import static org.junit.jupiter.api.Assertions.*;

class UserManagerTestSuite {
    @Test
    void getWorksusername(){
        List<String> chemistsList = new ArrayList<>();
        chemistsList.add("Walter White");
        chemistsList.add("Gale Boettiche");
        List<String> result = UsersManager.filterChemistGroupUsernames();
        assertEquals(chemistsList, result);
    }

    @Test
    void getCorrectAgeFilter(){
        List<String> chemistsList = new ArrayList<>();
        List<String> result = UsersManager.filterAgeUsernames(30);
        assertEquals(5, result.size());
    }
    @Test
    void getCorrectAgeGroupFilter(){
        //List<String> chemistsList = new ArrayList<>();
        List<String> result = UsersManager.filterAgeGroupUsernames("Chemists", 45);
        assertEquals(1, result.size());
    }

}