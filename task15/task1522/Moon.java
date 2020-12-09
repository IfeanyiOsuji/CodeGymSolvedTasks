package com.codegym.task.task15.task1522;

public class Moon implements  Planet {
    private Moon() {
    }

    private static Moon instance = null;

    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {

                instance = new Moon();
            }

        }
            return instance;

    }
}