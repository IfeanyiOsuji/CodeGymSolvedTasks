package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        HashMap<Integer,Integer> dict = new HashMap<Integer, Integer>();
        while(file.available()>0){
            int a = file.read();
            //char c = (char) a;
            //System.out.println(c);
            if(!dict.containsKey(a)){
                dict.put(a,1);
            }
            else {
                int t = dict.get(a);
                dict.put(a,t+1);
            }
        }
        file.close();
        //System.out.println(dict);
        Set<Integer> max = new HashSet<Integer>();
        int maxi = 0;
        for (Map.Entry<Integer,Integer> entry: dict.entrySet()) {
            if(entry.getValue() > maxi ){
                maxi = entry.getValue();
                //System.out.println(maxi+" "+entry.getValue());
            }

        }
        for (Map.Entry<Integer,Integer> entry: dict.entrySet()) {
            if(entry.getValue() < maxi) {
                maxi=entry.getValue();
                //System.out.println(max);
            }
        }
        for (Map.Entry<Integer,Integer> entry: dict.entrySet()) {
            if(entry.getValue() == maxi) {
                max.add(entry.getKey());
                //System.out.println(max);
            }
        }
        String result = "";
        for (Integer a : max) {
            //System.out.print(a+" ");
            result = result + a + " ";
        }
        result = result.substring(0,result.length()-1);
        System.out.println(result);
    }
}
