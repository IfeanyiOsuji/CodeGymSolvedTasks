package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
    BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String>files = new HashMap<>();
      String fileName;

      while(!(fileName = reader.readLine()).equals("end")){
        int partNumber = Integer.parseInt(fileName.split("\\.part")[1]);
        files.put(partNumber, fileName);
    }
    reader.close();

    if(!files.isEmpty()){
        String newFile = files.get(2).split("\\.part")[0];
        FileOutputStream fileOutputStream = new FileOutputStream(newFile);

        ArrayList<Integer>partNum = new ArrayList<>(files.keySet());
        Collections.sort(partNum);

        for(Integer file :partNum){
           FileInputStream fileInputStream1 =new FileInputStream(files.get(file));

           byte[]buffer = new byte[fileInputStream1.available()];
           fileInputStream1.read(buffer);
           fileOutputStream.write(buffer);
           fileInputStream1.close();
        }
        fileOutputStream.close();
    }




    }
}
