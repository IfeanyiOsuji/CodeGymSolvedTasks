package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*String file1 =args[0];
        String file2 = args[1];
        BufferedReader read = new BufferedReader(new FileReader(file1));
        FileWriter wrt =  new FileWriter(file2);
        String x="";

        ArrayList<String>list = new ArrayList<>();
        while(read.ready()){
            x=read.readLine();
            String t="";
            String []y = x.split(" ");
            for(int i =0; i<y.length; i++){

                String m = y[i];
                int a = m.length();
                if(a>6){
                     t = m;
                    list.add(t);

                }

            }
            //String j = list.get(list.size()-1);
            //list.remove(list.size()-1);
            //String b = j.substring(0, j.indexOf(","));
            //list.add(b);
            //for(String h:list)
             //   wrt.write(h);
            char []n = t.toCharArray();
            for(char v=0; v<n.length-1; v++)
                wrt.write(n[v]);

        }

        read.close();
        wrt.close();
        //
        /
         */
        /*String file1 = args[0];

        String file2 = args[1];

        BufferedReader bufferedReaderFile1 = new BufferedReader(new FileReader(file1));

        FileWriter fileWriter = new FileWriter(file2);

        int index = 0;
        boolean first = true;

        String word = "";

        while (bufferedReaderFile1.ready()){

            word = bufferedReaderFile1.readLine();

            String[] wordArray = word.split(" ");

            for(String w:wordArray){
                if(w.length()>6) {
                    fileWriter.write(w+",");
                    if (index == wordArray.length) {
                        fileWriter.write(w);
                    }
                }
                index++;
            }
            index =0;
            //first = false;
        }
        bufferedReaderFile1.close();
        fileWriter.close();

         */
        StringBuilder res = new StringBuilder();
        FileReader fr = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fr);

        while (reader.ready()) {
            String[] s = reader.readLine().trim().split(" ");

            for (String word : s) {
                if (word.length() > 6) {
                    res.append(word).append(',');
                }
            }
        }
        fr.close();
        reader.close();

        FileWriter writer = new FileWriter(args[1]);
        writer.write(res.substring(0, res.length() - 1));
        writer.close();


    }
}
