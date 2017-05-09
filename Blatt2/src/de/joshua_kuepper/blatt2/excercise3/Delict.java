package de.joshua_kuepper.blatt2.excercise3;

public class Delict {

    private final int points;
    private final double fees;

    public Delict(final int points, final double fees) {
        this.points = points;
        this.fees = fees;
    }

    public int getPoints() {
        return points;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "Delict{" +
             "points=" + points +
             ", fees=" + fees +
             '}';
    }
}
