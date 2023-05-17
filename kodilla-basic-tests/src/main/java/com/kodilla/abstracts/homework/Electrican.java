package com.kodilla.abstracts.homework;

public class Electrican extends Job{
    private String sep;

    public Electrican(double salary, String responsibilities, String sep){
        super(salary,responsibilities);
        this.sep = sep;
    }

    public String getSep() {
        return sep;
    }

    public String returnFullSpecialization(){
        return "electrican (SEP "+ this.sep + "), salary: "+ this.getSalary() + ", responsibilities: " + this.getResponsibilities();

    }
}
