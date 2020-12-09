package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream reader = new FileInputStream(args[0]);
        int count =0;
        int letter;

        while(reader.available()>0){
            letter = reader.read();
            //if((letter>64&&letter<91)||(letter>96&&letter<123)) // still works
                if(Character.isLetter(letter))
                count++;
        }

        reader.close();
        System.out.println(count);

    }
}
