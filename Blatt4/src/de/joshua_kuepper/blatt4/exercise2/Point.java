package de.joshua_kuepper.blatt4.exercise2;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point other) {
        return Math.sqrt(distanceSquared(other));
    }

    public double distanceSquared(Point other) {
        return Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
             "x=" + x +
             ", y=" + y +
             '}';
    }
}
