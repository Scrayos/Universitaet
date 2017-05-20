package de.joshua_kuepper.blatt4.exercise1;

public class DeterminantOperator implements Operator {

    @Override
    public Object execute(Matrix2D mat) {
        return mat.getX1() * mat.getY2() - mat.getX2() * mat.getY1();
    }
}
