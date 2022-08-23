package com.car;

public class Car {

    public double speed;

    public void accelerate(double nr) {
        if(nr > 0) {
            speed += nr;
        }
    }

    public double getSpeed() {
        return speed;
    }
}
