package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream str = new FileInputStream(file);
        ArrayList<Integer> list = new ArrayList<>();

        while(str.available()>0){
            int b=str.read();
            list.add(b);
        }
        str.close();
        int count =0;
        for(Integer comma:list){
            if(comma==44)
            ++count;
        }
        System.out.print(count);
    }
}
