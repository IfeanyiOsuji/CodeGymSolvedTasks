package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String a = read.readLine();
        read.close();
        BufferedReader reader = new BufferedReader(new FileReader(a));
        while(reader.ready()){
            String s = reader.readLine();
            char [] c = s.toCharArray();
            for(int d = c.length-1; d>=0; d--){
                System.out.print(c[d]);
            }
            System.out.println();
        }
        reader.close();
    }
}
