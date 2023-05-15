package com.dsa.strivers.step1.designpattern.creational.factorydesignpattern.shapeexample;

public class Client {

    public static void main(String[] args) {
// It is the responsibility of factory to generate the concrete class/object.
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        System.out.println(shape.getColour());
        System.out.println(shape.getArea(2));
        Shape shape2 = shapeFactory.getShape("square");
        System.out.println(shape2.getColour());
        System.out.println(shape2.getArea(2));
    }
}
