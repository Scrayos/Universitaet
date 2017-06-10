package de.joshua_kuepper.blatt5.exercise3;

import java.util.HashSet;

public class Catalogue {

    private final HashSet<Product> content = new HashSet<>();

    // delegation method
    public void add(Product product) {
        content.add(product);
    }

    public void printMe() {
        content.forEach(pd -> System.out.println(pd.toString() + " - " + pd.getPriceWithTax()));
    }
}
