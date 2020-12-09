package com.codegym.task.task15.task1522;

public class Earth implements  Planet {
    private Earth(){}
    private static Earth instance = null;
    public static Earth getInstance(){
        if(instance==null){
            synchronized (Earth.class) {
                instance = new Earth();
            }
        }
        return instance;
    }
}
