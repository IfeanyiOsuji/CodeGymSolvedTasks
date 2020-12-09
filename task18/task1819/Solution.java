package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream input1 = new FileInputStream(file1);
        FileOutputStream output = new FileOutputStream(file1);
        FileInputStream input2 = new FileInputStream(file2);
        byte [] getInput1 = new byte[input1.available()];
        byte [] getInput2 = new byte[input2.available()];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        if(input1.available()>0&&input2.available()>0){

            input1.read(getInput1);
            input2.read(getInput2);
            baos.write(getInput2);
            baos.write(getInput1);
            byte [] c = baos.toByteArray();
            output.write(c);
        }
        input1.close();
        input2.close();
        output.close();




    }
}
