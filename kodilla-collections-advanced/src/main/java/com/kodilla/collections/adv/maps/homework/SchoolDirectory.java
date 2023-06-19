package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal,School> schoolDir = new HashMap<>();
        Principal alan = new Principal("Alan", "Nowak", "Alan Nowak High School");
        Principal greg = new Principal("Greg", "Hancook", "Sports School");
        Principal kevin = new Principal("Kevin", "Murphy", "Music School");

        School alanSchool = new School(Arrays.asList(30,30,31,29,22,27));
        School gregSchool = new School(Arrays.asList(22,25,25,27,28,27,24,25));
        School kevinSchool = new School(Arrays.asList(28,28,27,29,26,26));

        schoolDir.put(alan,alanSchool);
        schoolDir.put(greg,gregSchool);
        schoolDir.put(kevin,kevinSchool);

        System.out.println(schoolDir.get(alan));
        for (Map.Entry<Principal,School> schoolEntry : schoolDir.entrySet()){
            System.out.println("Principial " + schoolEntry.getKey().getFirstName() + " " + schoolEntry.getKey().getLastName() + " of " + schoolEntry.getKey().getSchoolName() +
                    " have " + schoolEntry.getValue().getNumberOfStudents() + " students");
        }
    }
}
