package de.joshua_kuepper.blatt3.sheep;

public class Fur implements Cloneable {

    public int length;

    public Fur(int length) {
        this.length = length;
    }

    public String toString() {
        return "Felllaenge: " + length;
    }

    @Override
    @SuppressWarnings("MethodDoesntCallSuperMethod")
    public Fur clone() {
        return new Fur(length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fur fur = (Fur) o;

        return length == fur.length;
    }

    @Override
    public int hashCode() {
        return length;
    }
}
