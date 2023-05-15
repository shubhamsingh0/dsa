package com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.shapeexample;

public class Square implements Shape {
    @Override
    public String getColour() {
        return "black";
    }

    @Override
    public double getArea(int a) {
        return a * a;
    }
}
