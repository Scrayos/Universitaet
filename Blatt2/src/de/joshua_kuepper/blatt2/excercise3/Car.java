package de.joshua_kuepper.blatt2.excercise3;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public final class Car {

    private final List<Delict> delicts = new ArrayList<>(5);

    private String licensePlate;
    private String owner;
    private String address;

    public Car(final String licensePlate, final String owner, final String address) {
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.address = address;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }

    // delegation method
    public void registerDelict(final Delict del) {
        delicts.add(del);
    }

    public void printDelicts() {
        System.out.println(MessageFormat.format("Delikte des Autos {0}:", licensePlate));

        delicts.forEach(del -> System.out.println("  " + del.toString()));
    }
}
