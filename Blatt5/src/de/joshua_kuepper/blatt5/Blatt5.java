package de.joshua_kuepper.blatt5;

import de.joshua_kuepper.blatt5.exercise2.Auto;
import de.joshua_kuepper.blatt5.exercise2.Lastwagen;
import de.joshua_kuepper.blatt5.exercise3.Catalogue;
import de.joshua_kuepper.blatt5.exercise3.Clothing;
import de.joshua_kuepper.blatt5.exercise3.Product;
import de.joshua_kuepper.blatt5.exercise4.Circuit;
import de.joshua_kuepper.blatt5.exercise4.Component;
import de.joshua_kuepper.blatt5.exercise4.gate.AndGate;
import de.joshua_kuepper.blatt5.exercise4.gate.NotGate;
import de.joshua_kuepper.blatt5.exercise4.gate.OrGate;
import de.joshua_kuepper.blatt5.exercise4.gate.PassGate;

public class Blatt5 {

    public static void main(final String[] args) {
        Auto auto1 = new Lastwagen();
        System.out.println(auto1.reifen); // 4 -> 4 -> 4
        System.out.println(((Lastwagen) auto1).reifen); // 8 -> 8 -> 8
        System.out.println(auto1.getReifen()); // 8 -> 4 -> kompiliert nicht
        System.out.println(((Lastwagen) auto1).getReifen()); // 8 -> 4 -> kompiliert nicht

        // weil die variablen neu deklariert werden und nicht überschreiben. Die Methode überschreibt jedoch und erbt damit.


        Catalogue catalogue = new Catalogue();
        catalogue.add(new Product("Papier", "A4", 2.52D));
        catalogue.add(new Clothing("Hemd", "Herren-Hemd", 33.61D, 48, "Baumwolle"));
        catalogue.printMe();


        // variables
        Component inputA = new PassGate();
        Component inputB = new PassGate();

        // gates
        Component notGateCaseA = new NotGate();
        Component andGateCaseA = new AndGate();
        Component notGateCaseB = new NotGate();
        Component andGateCaseB = new AndGate();
        Component orGate = new OrGate();


        // connect gates
        inputA.connectTo(andGateCaseA);
        inputB.connectTo(notGateCaseA);
        notGateCaseA.connectTo(andGateCaseA);

        inputB.connectTo(andGateCaseB);
        inputA.connectTo(notGateCaseB);
        notGateCaseB.connectTo(andGateCaseB);

        andGateCaseA.connectTo(orGate);
        andGateCaseB.connectTo(orGate);

        /*
                A ->       -> \   COMMON     \
                B ->  NOT  -> /  AND GATE     \
                                               > OR GATE
                A ->  NOT  -> \   COMMON      /
                B ->       -> /  AND GATE    /
         */

        // create circuit
        Circuit circuit = new Circuit();
        circuit.getExitGates().add(orGate);

        // set entries
        inputA.setState(true);
        inputB.setState(false);

        // calculate
        System.out.println(circuit.simulate().get(0));
    }
}
