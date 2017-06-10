package de.joshua_kuepper.blatt5.exercise4.gate;

import de.joshua_kuepper.blatt5.exercise4.Component;

import java.util.ArrayList;

public class NotGate extends Component {

    @Override
    public boolean function(ArrayList<Component> inputs) {
        if (inputs.isEmpty()) throw new IllegalArgumentException("Kein Eingang spezifiziert");

        return !inputs.get(0).getState();
    }
}
