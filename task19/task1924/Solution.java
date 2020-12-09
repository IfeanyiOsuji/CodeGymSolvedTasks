package com.codegym.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static{
       // String [] word= {"one","two","three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
       // for(int i=1; i<=12; i++)
         //   map.put(i, word[i]);
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9, "nine");
        map.put(10,"ten");
        map.put(11, "eleven");
        map.put(12,"twelve");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader read = new BufferedReader(new FileReader(file));

        String getWord = "";
        while((getWord=read.readLine())!=null){
            String rplaceWord = getWord;

            for(Map.Entry<Integer, String>entry:map.entrySet()){
                rplaceWord= rplaceWord.replaceAll("\\b"+entry.getKey()+"\\b", entry.getValue());


            }
            System.out.println(rplaceWord);
        }
        read.close();

    }
}
