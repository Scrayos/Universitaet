package de.joshua_kuepper.blatt5.exercise1;

public class Praktikant extends Angestellter {

    private static final int SALARY = 400;

    public Praktikant(final String firstName, final String surName, final int age) {
        super(firstName, surName, age, SALARY);
    }

    @Override
    public void raiseSalary(final int salary) {
        throw new UnsupportedOperationException("Praktikanten haben ein statisches Gehalt von " + SALARY);
    }
}
