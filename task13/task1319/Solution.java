package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args)throws Exception {
        // write your code here
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        BufferedWriter write = null;

        try{
            //File file = new File(s);
            FileWriter rt = new FileWriter(s);
            write = new BufferedWriter(rt);
           //if(!file.exists()){
           //     file.createNewFile();
           // }
            while(true) {
                    String a = reader.readLine();
                if(!a.equals("exit")){

                    write.newLine();
                    write.write(a);
                }
                else
                if(a.equals("exit")){
                    write.newLine();
                    write.write(a);


                    break;
                }

            }

            write.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }



    }
}
