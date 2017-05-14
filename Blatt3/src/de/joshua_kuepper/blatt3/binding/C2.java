package de.joshua_kuepper.blatt3.binding;

class C2 extends C1 {
    static int s = 2;

    @Override
    void f1() {
        System.out.println("C2::f1");
    }

    void f3() {
        System.out.println("C2::f3");
    }
}
