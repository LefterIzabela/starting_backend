package com.animal;

public class Dog extends Mammal{

    public Dog(String species, boolean domesticated, int gestationPeriod, String name) {
        super("Dog", true, 4, "Cico");
        //trebuie chemat asa deoarece Animal nu are constructor fara parametrii
    }
}
