package de.joshua_kuepper.blatt3.sheep;

public class Sheep implements Cloneable {

    public String name;
    public Fur fur;

    public Sheep(String name, Fur fur) {
        this.name = name;
        this.fur = fur;
    }

    public void shear() {
        fur.length = 0;
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + fur.toString();
    }

    @Override
    @SuppressWarnings("MethodDoesntCallSuperMethod")
    public Sheep clone() {
        // strings are immutable
        return new Sheep(name, fur.clone());
    }

    public Sheep shallowClone() {
        return new Sheep(name, fur);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sheep sheep = (Sheep) o;

        if (name != null ? !name.equals(sheep.name) : sheep.name != null) return false;
        return fur != null ? fur.equals(sheep.fur) : sheep.fur == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (fur != null ? fur.hashCode() : 0);
        return result;
    }
}
