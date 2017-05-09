package de.joshua_kuepper.blatt2;

import de.joshua_kuepper.blatt2.excercise3.Car;
import de.joshua_kuepper.blatt2.excercise3.CarFactory;
import de.joshua_kuepper.blatt2.excercise3.Delict;
import de.joshua_kuepper.blatt2.excercise3.TrafficOffice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class Blatt2 {

    private static final String HELLO_PATTERN = "Hallo {0}!";
    private static final transient BufferedReader INPUT_READER;

    static {
        INPUT_READER = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String[] args) {
        // we cannot process the input without an assigned task
        if (args.length < 1) throw new IllegalArgumentException("Keine Aufgabe angegeben!");

        // assign the correct task
        switch (args[0]) {
            case "1a":
                task1a(args);
                break;

            case "1b":
                task1b(args);
                break;

            case "1c":
                task1c(args);
                break;

            case "2":
                task2(args);
                break;

            case "3b":
                task3b(args);
                break;

            case "3f":
                task3f(args);
                break;
        }
    }


    // ----- INDIVIDUAL TASKS ----- //

    private static void task1a(String[] args) {
        if (args.length < 2) throw new IllegalArgumentException("Es wurde kein Faktor übergeben!");

        int factor = parseInt(args[1]);

        System.out.println(MessageFormat.format("Fakultät von {0}: {1}", factor, factorial(factor, 0)));
    }

    private static void task1b(String[] args) {
        if (args.length < 3) throw new IllegalArgumentException("Es wurde kein n und k übergeben!");

        int n = parseInt(args[1]);
        int k = parseInt(args[2]);

        if (n < 0 || k < 0) throw new IllegalArgumentException("n und k müssen positiv sein.");

        System.out.println(MessageFormat.format("{0} über {1} = {2}", n, k, binomialCoefficient(n, k)));
    }

    private static void task1c(String[] args) {
        if (args.length < 3) throw new IllegalArgumentException("Es wurde kein n und k übergeben!");

        int n = parseInt(args[1]);
        int k = parseInt(args[2]);

        if (n < 0 || k < 0) throw new IllegalArgumentException("n und k müssen positiv sein.");

        System.out.println(MessageFormat.format("Modifiziertes Lottoproblem von {0} über {1} = {2}", n, k, binomialCoefficient(n, k) * factorial(k, 0)));
    }

    private static void task2(String[] args) {
        /*
        Standard für Fließkomma-Zahlen in Java ist der Datentyp Double (mit doppelter Präzision gegenüber einem Float). Durch das anhängen von f/F
        wird jedoch der Datentyp "Float" erzwungen, welcher Zahlen, die sich nicht leicht in IEEE-Floating-Point-Repräsentation darstellen lassen,
        mit geringerer Präzision speichern kann, als es ein Double vermag. Dadurch geht die entsprechende Präzision verloren, und die Zahlen sind
        nicht mehr identisch (und halten oft auch beide nicht mehr die präzise Zahl, da selbst ein Double Zahlen wie 0.1 nur bedingt darstellen
        kann).
         */
    }

    private static void task3b(String[] args) {
        Car carOne = new Car("SU-AB", "Joshua Dean Küpper", "Neunkirchen");
        Car carTwo = new Car("SU-CD", "Hasan Anis", "N/A");

        System.out.println(MessageFormat.format("Kennzeichen: {0} | {1}", carOne.getLicensePlate(), carTwo.getLicensePlate()));
        System.out.println(MessageFormat.format("Halter: {0} | {1}", carOne.getOwner(), carTwo.getOwner()));
        System.out.println(MessageFormat.format("Adressen: {0} | {1}", carOne.getAddress(), carTwo.getAddress()));
    }

    private static void task3f(String[] args) {
        Car carOne = CarFactory.buildCar("Max M.", "Kreuzbergweg 2");
        Car carTwo = CarFactory.buildCar("Simon S.", "Roemerstraße 164");

        TrafficOffice office = new TrafficOffice();
        office.registerCar(carOne);
        office.registerCar(carTwo);
        System.out.println(office.getCar(carOne.getLicensePlate()).getOwner());

        carTwo.registerDelict(new Delict(2, 48.5D));
        carTwo.registerDelict(new Delict(0, 20.0D));

        carTwo.printDelicts();
    }


    // ---------- UTILITY ---------- //

    // ----- READING ----- //

    private static String readString() {
        try {
            return INPUT_READER.readLine();
        } catch (IOException ex) {
            throw new IllegalStateException("Während des Parsens unseres Input-Streams ist ein Fehler aufgetreten!", ex);
        }
    }

    private static int readInt() throws NumberFormatException {
        return Integer.parseInt(readString());
    }

    private static float readFloat() throws NumberFormatException {
        return Float.parseFloat(readString());
    }

    // ----- PARSING ----- //

    private static int parseInt(String possibleInt) {
        try {
            return Integer.parseInt(possibleInt);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Es wurde ein Integer erwartet.", ex);
        }
    }

    // ----- CALCULATION ----- //

    private static long factorial(long n, long res) {
        // exit
        if (n < 1) return res;

        // initial value
        if (res == 0) res = 1;

        res *= n;

        return factorial(--n, res);
    }

    private static long binomialCoefficient(long n, long k) {
        if (n < k) {
            return 0;
        } else {
            return factorial(n, 0) / (factorial(k, 0) * factorial(n - k, 0));
        }
    }
}
