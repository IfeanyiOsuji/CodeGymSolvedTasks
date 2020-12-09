package com.codegym.task.task19.task1927;

/* 
Contextual advertising

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps =new PrintStream(byteArrayOutputStream);

        System.setOut(ps);
        testString.printSomething();
        String s = new String(byteArrayOutputStream.toByteArray());
        String []y = s.split("[\\r\\n]+");

        System.setOut(out);
        for(int i=0; i<y.length; i++){
            System.out.println(y[i]);
            if(i%2==1)
                System.out.println("CodeGym - online Java courses");
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
