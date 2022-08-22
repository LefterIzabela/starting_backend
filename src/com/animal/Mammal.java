package com.animal;

public class Mammal extends Animal{

    private int gestationPeriod;

    public Mammal(String species, boolean domesticated, int gestationPeriod, String name) {
        super(species, domesticated);
        this.setSpecies(species);
        this.gestationPeriod = gestationPeriod;
        // this.setDomesticated(domesticated);
        // this.gestationPeriod = gestationPeriod;
        // setter-ii ii folosim doar in cazul unui constructor gol al superclasei
        this.name = name; // pot sa accesez direct cu this
                          // deoarece este protected in superclasa
    }

    public int getGestationPeriod() {
        return gestationPeriod;
    }
    public void setGestationPeriod(int gestationPeriod) {
        this.gestationPeriod = gestationPeriod;
    }

    public boolean isMammalExtinct() {
        return super.isExtinct();
    }
}
