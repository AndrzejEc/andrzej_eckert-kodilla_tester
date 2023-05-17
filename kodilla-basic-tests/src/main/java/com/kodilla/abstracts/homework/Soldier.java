package com.kodilla.abstracts.homework;

public class Soldier extends Job{
    private String militaryRank;
    public Soldier(double salary, String responsibilities, String militaryRank){
        super(salary, responsibilities);
        this.militaryRank = militaryRank;
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public String returnFullSpecialization(){
        return "soldier ("+ this.militaryRank + "), salary: "+ this.getSalary() + ", responsibilities: " + this.getResponsibilities();
        //return "return soldier";
    }

}
