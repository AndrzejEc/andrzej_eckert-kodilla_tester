package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> nunberOfStudents = new ArrayList<>();

    public School(List<Integer> nunberOfStudents) {
        this.nunberOfStudents = nunberOfStudents;
    }

    @Override
    public String toString() {
        return "School{" +
                "nunberOfStudents=" + nunberOfStudents +
                '}';
    }

    public Integer getNumberOfStudents() {
        int sum = 0;
        for (int numberOF: nunberOfStudents)
            sum = sum + numberOF;
        return sum;
    }
}
