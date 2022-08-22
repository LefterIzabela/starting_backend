package com.interfaceExample;

public class PersonWalk implements Walkable{

    private int age;

    @Override
    public void walk() {
        System.out.println("The person walks");
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnderage(int age) {
        return this.age < age;
    }

    public boolean isUnderage() {
        return this.age < 18;
    }
}
