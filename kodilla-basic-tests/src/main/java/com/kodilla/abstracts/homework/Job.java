package com.kodilla.abstracts.homework;

public class Job {
    private double salary;
    private String responsibilities;
    public Job(double salary, String responsibilities){
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public double getSalary() {
        return salary;
    }

    public String returnFullSpecialization(){
        return salary + " " + responsibilities;
    }
}
