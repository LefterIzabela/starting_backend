package com.person;

import java.time.LocalDate;

public class Person { //toate clasele mostenesc implicit clasa Object
    // stare = reprezentata prin variabile
    // ex:

    private int age;
    private String firstName;
    private LocalDate birthdate;


    public Person() {

    }

    public Person(int age, String firstName, LocalDate birthdate) {
        // super(); // apeleaza constructorul parintelui
        this.age = age;
        this.firstName = firstName;
        this.birthdate = birthdate;
    }

    // comportamentul = reprezentat prin metode
    // ex:

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person [age = " + age + ", firstName = " + firstName + ", birthdate = " + birthdate + "]";
    }
}