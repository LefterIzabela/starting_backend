package com.shape;

public class Square extends Shape{

    private double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length, 2);
    }
}
