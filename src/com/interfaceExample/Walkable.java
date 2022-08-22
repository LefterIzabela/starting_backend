package com.interfaceExample;

public interface Walkable {

    // contine doar metode publice si abstracte
    void walk();

    // pot defini metode si sa ofer implementare
    default void defaultWalk() {
        System.out.println("Default walk");
    }
}
