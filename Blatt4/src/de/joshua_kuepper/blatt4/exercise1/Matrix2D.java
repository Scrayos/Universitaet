package de.joshua_kuepper.blatt4.exercise1;

public class Matrix2D {

    /** Die X-Koordinate des ersten Vektors. */
    private double x1;
    /** Die X-Koordinate des zweiten Vektors. */
    private double x2;

    /** Die Y-Koordinate des ersten Vektors. */
    private double y1;
    /** Die Y-Koordinate des zweiten Vektors. */
    private double y2;

    public Matrix2D(
         double x1, double x2,
         double y1, double y2
    ) {
        this.x1 = x1;
        this.x2 = x2;

        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getY1() {

        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public Object applyOperator(Operator o) {
        return o.execute(this);
    }

    @Override
    public String toString() {
        return "Matrix2D{" +
             "x1=" + x1 +
             ", x2=" + x2 +
             ", y1=" + y1 +
             ", y2=" + y2 +
             '}';
    }
}
