package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader read = new BufferedReader(new FileReader(file1));
        BufferedReader read2 = new BufferedReader(new FileReader(file2));
        String first ="";
        String second ="";
        while((first=read.readLine())!=null){
            allLines.add(first);
        }
        read.close();
        while ((second=read2.readLine())!=null){
            linesForRemoval.add(second);
        }
        read2.close();
        Solution sol = new Solution();
        sol.joinData();
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(linesForRemoval)) {
            for (int i = 0; i < allLines.size(); i++) {
                if (allLines.get(i).equals(linesForRemoval.get(i))) {
                    allLines.remove(i);
                }

            }



        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
