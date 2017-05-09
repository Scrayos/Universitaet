package de.joshua_kuepper.blatt2.excercise3;

public final class CarFactory {

    private CarFactory() {
    }

    /*
    Instanz-Methoden sind an ein bestimmtes Objekt gebunden, und müssen daher erst erstellt werden. Klassen-Methoden sind global und daher
    ohne Objekt gültig.
     */

    public static Car buildCar(String owner, String address) {
        return new Car(PasswordFactory.LITTLE_LETTERS.getRandomString(6), owner, address);
    }
}
