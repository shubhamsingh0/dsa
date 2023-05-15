package com.dsa.strivers.step1.designpattern.creational.builderdesignpattern;

public class StudentBuilder {

    public String name;
    public int age;
    public String course;
    public String subject;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public StudentBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
