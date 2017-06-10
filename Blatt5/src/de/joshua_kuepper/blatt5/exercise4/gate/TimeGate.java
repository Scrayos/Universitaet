package de.joshua_kuepper.blatt5.exercise4.gate;

import de.joshua_kuepper.blatt5.exercise4.Component;

import java.util.ArrayList;

public class TimeGate extends Component {

    @Override
    public boolean function(ArrayList<Component> inputs) {
        return ((int) (System.currentTimeMillis() / 1000L)) % 2 == 0;
    }
}
