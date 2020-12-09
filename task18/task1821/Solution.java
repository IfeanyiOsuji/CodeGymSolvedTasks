package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream(args[0]);

        ArrayList<Integer>list1 = new ArrayList<>();

        while(input.available()>0){
            list1.add(input.read());
        }


        Collections.sort(list1);
        //HashMap<Integer, Integer> hmap = new HashMap<>();

        LinkedHashMap<Integer, Integer> hmap = new LinkedHashMap<>();



           // for(int i=0; i<list1.size()-1; i++){
              // Integer temp = list1.get(i);
              // if(!hmap.containsKey(temp)){
                //   hmap.put(temp, Collections.frequency(list1, temp));
              // }
      //  }
        for(Integer list2:list1){
            Integer temp = list2;
            if(!hmap.containsKey(temp)){
                hmap.put(temp, Collections.frequency(list1, temp));
            }
        }
        input.close();
        for(Map.Entry<Integer, Integer> map:hmap.entrySet()){
            int j = map.getKey();
            System.out.println((char)j +" "+map.getValue());
        }

    }
}
