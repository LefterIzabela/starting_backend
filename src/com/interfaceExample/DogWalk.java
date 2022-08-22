package com.interfaceExample;

import com.animal.Mammal;

public class DogWalk extends Mammal implements Walkable{

    public DogWalk(String species, boolean domesticated, int gestationPeriod, String name) {
        super(species, domesticated, gestationPeriod, name);
    }

    @Override
    public void walk() {
        System.out.println("The dog walks");
    }
}
