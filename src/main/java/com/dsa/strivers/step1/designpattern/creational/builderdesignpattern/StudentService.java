package com.dsa.strivers.step1.designpattern.creational.builderdesignpattern;

public class StudentService {

    public static StudentBuilder studentBuilder = new StudentBuilder();

    public static void main(String[] args) {
        Student student = studentBuilder.setName("shubham").setAge(12).setCourse("MBA").setSubject("CS").build();
        System.out.println(student);
    }
}
