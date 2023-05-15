package com.dsa.strivers.step1.designpattern.creational.builderdesignpattern;

public class Student {

    private String name;
    private int age;
    private String course;
    private String subject;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.course = studentBuilder.course;
        this.subject = studentBuilder.subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
