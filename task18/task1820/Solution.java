package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1= reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output = new FileOutputStream(file2);

        byte [] tobyteArray = new byte[input.available()];

        if(input.available()>0){
            input.read(tobyteArray);
        }

        String inPutString = "";
        for(byte c : tobyteArray){
            inPutString+=(char)c;
        }
        String [] inputArray = inPutString.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s:inputArray){
            double d = Double.parseDouble(s);
            int i = (int)Math.round(d);

            sb.append(i+" ");
        }
        sb.deleteCharAt(sb.length()-1);

        for(char e:sb.toString().toCharArray()){
            output.write(e);
        }
        input.close();
        output.close();
    }
}
