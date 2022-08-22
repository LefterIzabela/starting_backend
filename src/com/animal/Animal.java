package com.animal;

public class Animal {

    private String species;
    private boolean domesticated;
    protected String name;

    public Animal(String species, boolean domesticated) {
        this.species = species;
        this.domesticated = domesticated;
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isDomesticated() {
        return domesticated;
    }
    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    protected boolean isExtinct(){
        return true;
    }
}
