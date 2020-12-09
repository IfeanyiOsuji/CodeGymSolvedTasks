package com.codegym.task.task16.task1632;

public class Thread4 extends Thread implements Message {
    public void run(){
        while(this.isAlive()){

        }
           // showWarning();
    }
    public void showWarning(){
        this.stop();
    }
}
