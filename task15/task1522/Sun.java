package com.codegym.task.task15.task1522;

public class Sun implements Planet {
    private Sun(){}
        private static Sun instance = null;
    public static Sun getInstance(){
        if(instance==null){
            synchronized (Sun.class) {
                instance = new Sun();
            }
        }
        return instance;
    }
}
