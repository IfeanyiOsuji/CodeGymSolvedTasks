package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream input = new FileInputStream(file1);

        FileOutputStream outPut1 = new FileOutputStream(file2);
        FileOutputStream outPut2 = new FileOutputStream(file3);

            if(input.available()>0){
                byte[] fullData = new byte[(input.available())];
                int halfLength=0;
                
                if ((fullData.length % 2) == 0) {
                    halfLength = (fullData.length / 2);
                   input.read(fullData);
                    outPut1.write(fullData, 0, halfLength);
                    outPut2.write(fullData, halfLength, halfLength);
                } else {
                    halfLength = (fullData.length / 2);
                    halfLength++;
                    input.read(fullData);
                    outPut1.write(fullData, 0, halfLength);
                    outPut2.write(fullData, halfLength, fullData.length-halfLength);
                }
            }
             input.close();
            outPut1.close();
            outPut2.close();
    }
}
