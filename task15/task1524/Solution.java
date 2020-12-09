package com.codegym.task.task15.task1524;

/* 
Order of loading variables

*/

public class Solution {
    static {
        init();
        System.out.println("Static block");
        System.out.println("public static void main");
        System.out.println("Non-static block");
        Solution s = new Solution();
        //printAllFields(s);

    }

    {

        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    public Solution() {
        printAllFields(this);
        System.out.println("Solution constructor");

    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {


        Solution s = new Solution();
        printAllFields(s);

    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.name);
        System.out.println(obj.i);
    }
}
