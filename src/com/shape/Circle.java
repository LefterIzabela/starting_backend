package com.shape;

public class Circle extends Shape{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double length) {
        this.radius = length;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}