package de.joshua_kuepper.blatt3.singleton;

public class SingletonApproach {

    private static final SingletonApproach INSTANCE = new SingletonApproach();

    private SingletonApproach() {
    }

    public static SingletonApproach getInstance() {
        return INSTANCE;
    }
}
