package de.joshua_kuepper.blatt5.exercise4.gate;

import de.joshua_kuepper.blatt5.exercise4.Component;

import java.util.ArrayList;

public class NorGate extends OrGate {

    @Override
    public boolean function(ArrayList<Component> inputs) {
        return !super.function(inputs);
    }
}
