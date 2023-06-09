package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private Double width;
    private Double height;
    private Boolean stamped;

    public Stamp(String name, Double width, Double height, Boolean stamped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(name, stamp.name) && Objects.equals(width, stamp.width) && Objects.equals(height, stamp.height) && Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", stamped=" + stamped +
                '}';
    }
}
