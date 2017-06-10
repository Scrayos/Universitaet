package de.joshua_kuepper.blatt5.exercise3;

public class Clothing extends Product {

    int size;
    String material;

    public Clothing(String name, String desc, double price, int size, String material) {
        super(name, desc, price);

        this.size = size;
        this.material = material;
    }


    public String toString() {
        return name + " - " + description + " - " + price + " EUR - " + size + " - " + material;
    }
}
