package de.joshua_kuepper.blatt2.excercise3;

import java.util.ArrayList;
import java.util.List;

public class TrafficOffice {

    private static final int CAR_CAPACITY = 100;

    private final List<Car> registeredCars = new ArrayList<>(CAR_CAPACITY);


    // ----- DELEGATION FOR LIST ----- //

    public void registerCar(final Car car) {
        registeredCars.add(car);
    }

    public Car getCar(final String licensePlate) {
        return registeredCars.stream()
             .filter(car -> car.getLicensePlate().equalsIgnoreCase(licensePlate)) // license plates are case-insensitive
             .findAny()
             .orElseThrow(() -> new IllegalStateException("Kein Auto mit dem Kennzeichen vorhanden."));
    }
}
