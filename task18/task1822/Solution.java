package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream));

        //read all lines from file and add to ArrayList
        String s;
        ArrayList<String> products = new ArrayList<>();

        while ((s=fileReader.readLine())!=null){
            products.add(s);
        }

        reader.close();
        fileInputStream.close();
        fileReader.close();

        HashMap<Integer, String> idAndInfo = new HashMap<>();

        //add all products to HashMap with Key = ID and Value = product info
        for (int i = 1; i<products.size(); i++){
            String[] info = products.get(i).split(" ",2);
            int id = Integer.parseInt(info[0]);
            //String productInfo = "";
            String productInfo = info[1];
            //for (int j = 1; j<info.length;j++){
             //   productInfo += (info[j] + " ");
           // }
         //  productInfo.trim();
            idAndInfo.put(id, productInfo);
        }

        productSearch(idAndInfo, args[0]);
    }
    //method for searching product info based on passed ID argument
    public static void productSearch(HashMap<Integer, String> hashMap, String a){
        int id = Integer.parseInt(a);
        for (HashMap.Entry<Integer, String> pair : hashMap.entrySet()){
            if (id==pair.getKey())
                System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
}
