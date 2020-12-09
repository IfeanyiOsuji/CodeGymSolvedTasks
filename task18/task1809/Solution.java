package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 =reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        byte []inputByte = new byte[inputStream.available()];

        if(inputStream.available()>0){
           inputStream.read(inputByte);
        }
       for(int a=inputByte.length-1; a>=0; a--){
           outputStream.write(inputByte[a]);
       }
       inputStream.close();
        outputStream.close();



    }
}
