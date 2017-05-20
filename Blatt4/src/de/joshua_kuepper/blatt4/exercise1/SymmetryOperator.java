package de.joshua_kuepper.blatt4.exercise1;

public class SymmetryOperator implements Operator {

    @Override
    public Object execute(Matrix2D mat) {
        return mat.getY1() == mat.getX2();
    }
}
