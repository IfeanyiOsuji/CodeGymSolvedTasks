package com.codegym.task.task15.task1521;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Tree No. %d , Object method, parameter: %s", number, s.getClass().getSimpleName()));
    }
}
