package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Thread5 extends Thread {
    String num;
    public void run(){
        sum();
    }
    public static void sum() {
        String num = "";
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        double get = 0.0;
        while (true) {

            num = scan.nextLine();
            if(num.equals("N"))
                break;
            double num1 = Double.parseDouble(num);
            get += num1;

        }

        System.out.println(get);
    }
}
