package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s="";
        try {
        while(true) {

            s = reader.readLine();
            FileInputStream stream = new FileInputStream(s);


            if (stream.available() > 0) {
                stream.close();
            }
        }
            }
            catch (FileNotFoundException e){
                reader.close();
                System.out.println(s);

            }




    }
}
