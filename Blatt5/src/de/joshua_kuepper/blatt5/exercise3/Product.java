package de.joshua_kuepper.blatt5.exercise3;

public class Product {

    // Es gibt keinen "Subclass"-Modifier in Java.

    String name;
    String description;
    double price; // Netto

    public Product(String name, String desc, double price) {
        this.name = name;
        this.description = desc;
        this.price = price;
    }


    protected final double getPriceWithTax() {
        return price * 1.19;
    }

    public String toString() {
        return name + " - " + description + " - " + price + " EUR";
    }
}
