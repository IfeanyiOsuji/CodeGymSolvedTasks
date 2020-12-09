package com.codegym.task.task18.task1802;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Minimum byte

*/

public class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream str = new FileInputStream(file);
        ArrayList<Long>list = new ArrayList<>();

            long c = str.read();
        while(str.available()>0){
           long b=str.read();
            list.add(b);
        }
        str.close();
         Collections.sort(list);
         long y = list.get(0);
        System.out.println(y);

    }
}
