package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        int countSpace =0;
        int countChar=0;


        while(reader.available()>0){
            int letter = reader.read();
            countChar++;
            if(Character.isSpaceChar(letter))
                countSpace++;

        }
        reader.close();
        double ratio = (double) countSpace/countChar*100;
        System.out.printf("%6.2f", ratio);

    }
}
