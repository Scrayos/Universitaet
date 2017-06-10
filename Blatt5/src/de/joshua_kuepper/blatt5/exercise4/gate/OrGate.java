package de.joshua_kuepper.blatt5.exercise4.gate;

import de.joshua_kuepper.blatt5.exercise4.Component;

import java.util.ArrayList;

public class OrGate extends Component {

    @Override
    public boolean function(ArrayList<Component> inputs) {
        return inputs.stream().anyMatch(Component::getState); // true if any input is true
    }
}
