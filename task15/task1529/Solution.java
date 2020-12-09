package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //write your code here

         reset();

    }

    public static CanFly result;

    public static void reset() {
        //write your code here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = read.readLine();
            if(s.equals("helicopter")){
                result = new Helicopter();
            }
            else if(s.equals("plane")){
                int num = Integer.parseInt(read.readLine());
                result = new Plane(num);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try {
            read.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
