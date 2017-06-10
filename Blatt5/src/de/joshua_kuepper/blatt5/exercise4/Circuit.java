package de.joshua_kuepper.blatt5.exercise4;

import java.util.ArrayList;

public class Circuit {

    private final ArrayList<Component> exitGates = new ArrayList<>();


    // ---------- ACCESSORS ---------- //

    // ----- GETTERS ----- //

    public ArrayList<Component> getExitGates() {
        return exitGates;
    }


    // ---------- PROCESSING ---------- //

    // ----- RUN ----- //

    public ArrayList<Boolean> simulate() {
        ArrayList<Boolean> results = new ArrayList<>();
        for (Component c : exitGates) {
            recursiveEvaluate(c);
            results.add(c.getState());
        }
        return results;
    }

    // ----- CALCULATE ----- //

    public void recursiveEvaluate(final Component c) {
        for (Component pre : c.getPredecessors()) recursiveEvaluate(pre);

        c.evaluate();
    }
}
