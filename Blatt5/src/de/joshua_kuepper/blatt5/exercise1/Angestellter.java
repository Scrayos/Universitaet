package de.joshua_kuepper.blatt5.exercise1;

public class Angestellter {

    private final String firstName;
    private final String surName;
    private int age;
    private int salary;


    public Angestellter(final String firstName, final String surName, final int age, final int salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }


    // ---------- ACCESSORS ---------- //

    // ----- GETTERS ----- //

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    // ----- MODIFIERS ----- //

    public void raiseAge() {
        this.age++;
    }

    public void raiseSalary(final int salary) {
        this.salary += salary;
    }
}
