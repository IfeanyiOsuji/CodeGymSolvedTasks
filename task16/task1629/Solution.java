package com.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //public static volatile AtomicInteger prntcount = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //write your code here
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();






    }

    //write your code here
    public static class Read3Strings extends Thread{
       public  ArrayList<String>list = new ArrayList<>();
        public void run(){
            int a =0;

                try{
                    for(int i=0;i<3;i++){

                    list.add(reader.readLine());

                }

            }
                catch (IOException e){

                }
        }
        public  void printResult(){

            for(int x=0; x<list.size(); x++){
                System.out.print(list.get(x)+" ");
               // prntcount.incrementAndGet();

            }
            System.out.println();

        }

    }
}
