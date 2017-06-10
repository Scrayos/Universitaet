package de.joshua_kuepper.blatt5.exercise4;

import java.util.ArrayList;

public abstract class Component {

    private final ArrayList<Component> predecessors = new ArrayList<>();

    private boolean state = false;


    // ---------- ACCESSORS ---------- //

    // ----- GETTERS ----- //

    public ArrayList<Component> getPredecessors() {
        return predecessors;
    }

    public boolean getState() {
        return state;
    }

    // ----- SETTERS ----- //

    public void setState(boolean state) {
        this.state = state;
    }


    // ---------- PROCESSING ---------- //

    // ----- CONNECT ----- //

    public void connectTo(final Component target) {
        target.predecessors.add(this);
    }

    // ----- RUN ----- //

    void evaluate() {
        state = function(predecessors);
    }

    // ----- CALCULATE ----- //

    public abstract boolean function(ArrayList<Component> inputs);
}
