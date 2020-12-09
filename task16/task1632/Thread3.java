package com.codegym.task.task16.task1632;

public class Thread3 extends Thread {
    public void run(){
        while(true){
            try {
                System.out.println("Hurray");
                Thread.sleep(500);

            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
