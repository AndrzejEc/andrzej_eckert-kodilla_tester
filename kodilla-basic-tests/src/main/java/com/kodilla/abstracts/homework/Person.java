package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    Job job;
    public Person(String firstName, int age, Job job){
        this.firstName=firstName;
        this.age=age;
        this.job=job;
    }
    public void showPersonJob(){

        System.out.println("First Name: " + firstName + ", age: "+age + ", " + job.returnFullSpecialization());

    }
}
