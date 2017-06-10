package de.joshua_kuepper.blatt5.exercise4.gate;

import de.joshua_kuepper.blatt5.exercise4.Component;

import java.util.ArrayList;

public class NandGate extends AndGate {

    @Override
    public boolean function(ArrayList<Component> inputs) {
        return !super.function(inputs);
    }
}
