package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileOutputStream outPut = new FileOutputStream(file1);
        FileInputStream input1 = new FileInputStream(file2);
        FileInputStream input2 = new FileInputStream(file3);

        byte [] getInput1 = new byte[input1.available()];
        byte [] getInput2 = new byte[input2.available()];


        if(input1.available()>0&& input2.available()>0){
            int read =input1.read(getInput1);
            int read2 = input2.read(getInput2);
            byte [] totalInput = Arrays.copyOf(getInput1,read+read2);
            System.arraycopy(getInput2, 0, totalInput, read, read2);


            outPut.write(totalInput, 0, totalInput.length);

            //outPut.write(getInput2, 0, read2);
        }
        input1.close();
        input2.close();
        outPut.close();


    }
}
