package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String param = args[0];
        FileReader read = new FileReader(param);
        BufferedReader read2 = new BufferedReader(read);
        LinkedHashMap<String, Double>map = new LinkedHashMap<>();
        while(read2.ready()){
            String s = read2.readLine();
            String []c = s.split(" ");
            String we = c[0];
            double me = Double.parseDouble(c[1]);

            if(map.containsKey(we)){
              map.replace(we, map.get(we)+me);
            }
            else{
                map.put(we, me);
            }

        }
        read.close();
        read2.close();
        Map<String, Double> treemap = new TreeMap<>(map);
        for(Map.Entry<String, Double> entry: treemap.entrySet())
            System.out.println(entry.getKey() + " "+entry.getValue());

    }
}
