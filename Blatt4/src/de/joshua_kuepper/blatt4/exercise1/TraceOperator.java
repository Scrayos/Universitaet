package de.joshua_kuepper.blatt4.exercise1;

public class TraceOperator implements Operator {

    @Override
    public Object execute(Matrix2D mat) {
        return mat.getX1() + mat.getY2();
    }
}
