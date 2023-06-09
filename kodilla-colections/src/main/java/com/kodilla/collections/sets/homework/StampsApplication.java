package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("clouds", 2.0,2.0, true));
        stamps.add(new Stamp("clouds", 2.0,3.0, true));
        stamps.add(new Stamp("forest", 2.0,2.0, false));
        stamps.add(new Stamp("lake", 2.0,2.0, true));
        stamps.add(new Stamp("grass", 2.0,2.0, true));
        stamps.add(new Stamp("stones", 2.0,2.0, true));
        stamps.add(new Stamp("clouds", 2.0,2.0, true));

        System.out.println(stamps.size());
        for (Stamp stamp: stamps)
            System.out.println(stamp);
    }
}
