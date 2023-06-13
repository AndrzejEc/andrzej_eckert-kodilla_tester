package com.kodilla.collections.adv.maps.complex;

import java.util.Objects;

public class Student {
    private String firtName;
    private String lastName;

    public Student(String firtName, String lastName) {
        this.firtName = firtName;
        this.lastName = lastName;
    }

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firtName, student.firtName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firtName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firtName='" + firtName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
