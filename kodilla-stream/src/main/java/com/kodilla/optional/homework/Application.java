package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("student1", new Teacher("teacher1")));
        students.add(new Student("student2", null));
        students.add(new Student("student3", new Teacher("teacher3")));
        students.add(new Student("student4", null));

        for (Student student : students) {
            Optional <Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("undefined")).getName();
            System.out.println("student: " + student.getName() + " teacher: " + teacherName);
        }
    }
}
