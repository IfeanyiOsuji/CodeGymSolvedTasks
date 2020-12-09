package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream str = new FileInputStream(file);
        HashSet<Integer> list = new HashSet<>();
        //ArrayList<String> list1 = new ArrayList<>();

        long c = str.read();
        while(str.available()>0){
            Integer b=str.read();
            //String d = String.valueOf(b);
            list.add(b);
        }
        str.close();

        //for(int i=0; i<list.size(); i++){
          //  for(int j=1; j<=list.size(); j++){
           // if(!(list.subList(j, list.size()-1)).contains(list.get(i))) {
              //  list1.add(list.get(i));
           // }
           // }
       // }
        List<Integer> list1= new ArrayList<Integer>(list);
        Collections.sort(list1);
        //int t = list1.get(0);
        //String p="";
        for(int i=0; i<list1.size(); i++)

        System.out.print(list1.get(i)+" ");

    }
}
