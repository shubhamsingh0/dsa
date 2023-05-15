package com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.shapeexample;

public class Circle implements Shape {
    @Override
    public String getColour() {
        return "red";
    }

    @Override
    public double getArea(int a) {
        return Math.PI * a * a;
    }
}
