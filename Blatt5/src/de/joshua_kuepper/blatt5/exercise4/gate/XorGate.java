package de.joshua_kuepper.blatt5.exercise4.gate;

import de.joshua_kuepper.blatt5.exercise4.Component;

import java.util.ArrayList;

public class XorGate extends Component {

    @Override
    public boolean function(ArrayList<Component> inputs) {
        boolean found = false;
        for (Component input : inputs) {
            // check if input is true
            if (input.getState()) continue;

            // handle exclusivity
            if (found) return false;
            else found = true;
        }
        return found;
    }
}
