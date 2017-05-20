package de.joshua_kuepper.blatt4.exercise2;

public class Point3D extends Point {

    private final double z;

    public Point3D(double x, double y, double z) {
        super(x, y);

        this.z = z;
    }

    public double distance(Point3D other) {
        return Math.sqrt(distanceSquared(other));
    }

    public double distanceSquared(Point3D other) {
        return Math.pow(getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2) + Math.pow(this.getZ() - other.getZ(), 2);
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Point{" +
             "x=" + getX() +
             ", y=" + getY() +
             ", z=" + getZ() +
             '}';
    }
}
