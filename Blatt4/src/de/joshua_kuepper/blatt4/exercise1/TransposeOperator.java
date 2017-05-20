package de.joshua_kuepper.blatt4.exercise1;

public class TransposeOperator implements Operator {

    @Override
    public Object execute(Matrix2D mat) {
        return new Matrix2D(mat.getX1(), mat.getY1(), mat.getX2(), mat.getY2());
    }
}
