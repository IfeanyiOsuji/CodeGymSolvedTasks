package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    static String [] get;
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        FileReader fr = new FileReader(file1);
        String file2 = args[1];


        BufferedReader read = new BufferedReader(fr);

        //FileWriter fl = new FileWriter(file2);
        BufferedWriter wt = new BufferedWriter(new FileWriter(file2));

        String line = "";
        while ((line=read.readLine()) != null){
            String tem = line;
            get = tem.split(" ");
            String regex = (".*\\d.*");
            for(int i=0; i<get.length; i++){
                String reg = get[i];
                if(reg.matches(regex)){
                    wt.write(reg+" ");
                }
            }
    }
        fr.close();
        read.close();
       // fl.close();
        wt.close();


    }
}
