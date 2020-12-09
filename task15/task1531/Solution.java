package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //write your code here
        BigDecimal num = new BigDecimal(1);
        BigDecimal sum = new BigDecimal(n);
        if(n<0)
            return "0";
        for(BigDecimal m = num; m.compareTo(sum)!=1; m=m.add(new BigDecimal(1)))
            num = num.multiply(m);
        return num.toString();
    }
}
