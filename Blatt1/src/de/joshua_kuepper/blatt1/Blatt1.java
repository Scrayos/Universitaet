package de.joshua_kuepper.blatt1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Scanner;

public class Blatt1 {

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

            case "2a":
                task2a(args);
                break;

            case "3":
            case "3a":
            case "3b":
            case "3c":
                task3(args);
                break;
        }
    }


    // ----- INDIVIDUAL TASKS ----- //

    private static void task1a(String[] args) {
        if (args.length < 2) throw new IllegalArgumentException("Es wurde kein Name übergeben!");

        System.out.println(MessageFormat.format(HELLO_PATTERN, args[0]));
    }

    private static void task1b(String[] args) {
        if (args.length < 3) throw new IllegalArgumentException("Es wurde kein Name übergeben!");

        int addend1;
        int addend2;
        try {
            addend1 = Integer.parseInt(args[1]);
            addend2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Es müssen zwei Zahlen übermittelt werden!", ex);
        }

        System.out.println(MessageFormat.format("{0} + {1} = {2}", addend1, addend2, (addend1 + addend2)));
    }

    private static void task2a(String[] args) {
        System.out.println("Wie ist dein Name? ");

        String name = readString();

        System.out.println(MessageFormat.format(HELLO_PATTERN, name));
    }

    private static void task3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe: ");
        int readInt = scanner.nextInt();

        System.out.println(++readInt);
        System.out.println(readInt);
        System.out.println(readInt++);

        /*
        Hier wird immer die selbe Zahl ausgegeben, da der Preinkrement den Wert vor der Ausgabe erhöht, die Ausgabe selbst den Wert nicht
        verändert, und der Postinkrement den Wert erst nach Ausgabe verändert.
        */

        int testValue = 5;
        double result = testValue / 2;
        System.out.println(MessageFormat.format("5 / 2 = {0}", result));

        /*
        Werden zwei ints mit mathematischen Operatoren verknüpft, so ist das Standardverhalten spezielle Integer-Operationen durchzuführen.
        Um dies zu umgehen, muss mindestens einer der Werte explizit zu einem Double gecastet werden. Dies ist zum Beispiel möglich durch
        das Anhängen eines "D"s an die Konstanten.
        */

        boolean b = false;
        if (b = false) {
            System.out.println("b ist falsch.");
        } else {
            System.out.println("b ist wahr.");
        }

        /*
        Der gemachte Fehler ist, dass hier kein Vergleich durchgeführt wird (der im Übrigen bei boolschen Werten ohnehin redundant gewesen
        wäre), sondern eine Zuweisung. Bei einer Zuweisung wird immer der neue Wert als Rückgabe berücksichtigt.
         */

        System.out.println("b ist " + (b ? "wahr" : "falsch"));
    }


    // ---------- UTILITY ---------- //

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
}
