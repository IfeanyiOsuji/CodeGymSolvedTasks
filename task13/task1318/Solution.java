package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws  Exception {
        // write your code here
        BufferedReader reader = null;
        InputStream st = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String fil = reader.readLine();
            st = new FileInputStream(fil);
            while (st.available()>0){
                char c = (char)st.read();
                System.out.print(c);
            }

        }
        catch (Exception e){
                    e.printStackTrace();
        }
        finally{
            reader.close();
            st.close();
        }
    }
}