package com.codegym.task.task16.task1623;

/* 
Creating threads recursively

*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public  GenerateThread(){
            super(String.valueOf(++createdThreadCount));
            this.start();
        }
        public void run(){

            if(createdThreadCount<count){
               GenerateThread gt = new GenerateThread();
               try {
                   gt.join();
                   System.out.println(gt);
               }
                catch (InterruptedException e){
                   e.printStackTrace();
                }
            }
        }
        public String toString(){
            return getName() +" created";
        }
    }
}
