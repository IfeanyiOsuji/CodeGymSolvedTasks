package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream str = new FileInputStream(file);
        ArrayList<Long> list = new ArrayList<>();

        long c = str.read();
        while(str.available()>0){
            long b=str.read();
            list.add(b);
        }
        str.close();
        Collections.sort(list);
        long y = list.get(list.size()-1);
        System.out.println(y);
    }
}
