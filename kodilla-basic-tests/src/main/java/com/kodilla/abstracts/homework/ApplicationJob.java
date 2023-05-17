package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {
        Job job = new Job(0, "no name");
        Soldier soldier = new Soldier(5000, "defense", "corporal");
        Electrican electrican = new Electrican(6000, "troubleshooting", "12kV");


        System.out.println(job.getSalary());
        System.out.println(job.getResponsibilities());

        System.out.println(soldier.getSalary());
        System.out.println(soldier.getResponsibilities());
        System.out.println(soldier.getMilitaryRank());

        System.out.println(electrican.getSalary());
        System.out.println(electrican.getResponsibilities());
        System.out.println(electrican.getSep());


        Person test = new Person("Test", 44, job);
        Person greg = new Person("Greg", 44, soldier);
        Person jack = new Person("Jack", 50, electrican);
        System.out.println("List of employees:");
        test.showPersonJob();
        greg.showPersonJob();
        jack.showPersonJob();
    }
}
