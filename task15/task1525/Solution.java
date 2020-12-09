package com.codegym.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();
    static {
        try {
            String s;
            FileReader read = new FileReader(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(read);

            while((s=reader.readLine()) != null){
                lines.add(s);
            }
            reader.close();

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
