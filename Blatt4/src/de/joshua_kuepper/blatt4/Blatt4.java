package de.joshua_kuepper.blatt4;

import de.joshua_kuepper.blatt4.exercise1.DeterminantOperator;
import de.joshua_kuepper.blatt4.exercise1.Matrix2D;
import de.joshua_kuepper.blatt4.exercise1.Operator;
import de.joshua_kuepper.blatt4.exercise1.SymmetryOperator;
import de.joshua_kuepper.blatt4.exercise1.TraceOperator;
import de.joshua_kuepper.blatt4.exercise1.TransposeOperator;
import de.joshua_kuepper.blatt4.exercise3.Cauliflower;
import de.joshua_kuepper.blatt4.exercise3.Food;
import de.joshua_kuepper.blatt4.exercise3.Spaghetti;
import de.joshua_kuepper.blatt4.exercise3.Student;

public class Blatt4 {

    public static void main(String[] args) {
        Matrix2D mat = new Matrix2D(2, 3, -1, 2);
        Operator operators[] = {new DeterminantOperator(), new TraceOperator(),
             new SymmetryOperator(), new TransposeOperator()};
        for (Operator operator : operators) {
            System.out.println("Ergebnis: " + operator.getClass().toString());
            System.out.println(mat.applyOperator(operator).toString());
        }


        Student student = new Student();

        Cauliflower cauli = new Cauliflower();
        student.eat(cauli);

        Spaghetti spaghetti = new Spaghetti();
        student.eat(spaghetti);

        Food food = new Cauliflower();
        student.eat(food);
    }

    // Do not Like, Like, Like -> Auswirkung des statischen Bindens an Methoden beim kompilieren: http://javarevisited.blogspot.de/2012/03/what-is-static-and-dynamic-binding-in.html
}
