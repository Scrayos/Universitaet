package de.joshua_kuepper.blatt4.exercise3;

public class Student {

    public void eat(Food food) {
        System.out.println("I like " + food.getMeal());
    }

    public void eat(Cauliflower cauli) {
        System.out.println("I don’t like " + cauli.getMeal());
    }
}
