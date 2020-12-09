package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        int a = 0;
        FileReader file2 = new FileReader(file);

        BufferedReader read = new BufferedReader(file2);
        String line = null;
       // ArrayList<String> list = new ArrayList<>();
        while((line=read.readLine())!=null){
            String []get = line.split(" ");
            for(String ar : get){
                for(int j=0; j<words.size(); j++){
                    if(ar.matches(words.get(j)))
                        a++;
                }
            }
            if(a==2)
                System.out.println(line);
                a=0;
        }
        file2.close();
            read.close();

    }
}
