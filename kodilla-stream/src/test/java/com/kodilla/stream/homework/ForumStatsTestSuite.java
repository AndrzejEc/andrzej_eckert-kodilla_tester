package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {
    @Test
    void testLess40(){
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50,7,"Chemists"));
        users.add(new User("Jessie Pinkman",25,4648,"Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        Double result = ForumStats.calcAvgPostsLessAge40(users);
        assertEquals(2382, result);
    }
    @Test
    void testMore40(){
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50,7,"Chemists"));
        users.add(new User("Tuco Salamanca", 55, 116, "Manager"));
        users.add(new User("Jessie Pinkman",25,4648,"Sales"));
        Double result = ForumStats.calcAvgPostsMoreEqualsAge40(users);
        assertEquals(61.50, result);
    }
    @Test
    void testEqual40(){
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50,7,"Chemists"));
        users.add(new User("Gale Boettiche", 40,2,"Chemists"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Jessie Pinkman",25,4648,"Sales"));
        Double result = ForumStats.calcAvgPostsMoreEqualsAge40(users);
        assertEquals(4.5, result);
    }
}