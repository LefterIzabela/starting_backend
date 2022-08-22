package com.shape;

public abstract class Shape {

    private String name;

    public String getName() {
        return name;
    }
    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea(); // double este mai precis
}
