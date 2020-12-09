package com.codegym.task.task19.task1918;

/* 
Introducing tags

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
        String fileName = read.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        String data="";
        while((line=reader.readLine())!=null){
            data +=line;
        }
        reader.close();
        read.close();

        String openingTag = "<"+args[0];
        String closingTag = "/>"+args[0]+">";
    char alpha = '*';
    char omega = '+';
    data = data.replaceAll(openingTag, ""+alpha);
    data = data.replaceAll(closingTag, ""+omega);
    data = data.substring(data.indexOf(alpha));
    StringBuilder sb = new StringBuilder();
    while(data.contains(""+alpha)){
        int alphaCount = 0;
        int omegaCount = 0;
        for(int i=0; i<data.length(); i++){
            if(alpha==data.charAt(i))
                alphaCount++;
            else
                if(omega==data.charAt(i))
                    omegaCount++;
            if(alphaCount>0&&alphaCount==omegaCount){
                String tags = data.substring(0, i+1);
                tags = tags.replaceAll(" "+alpha, openingTag);
                tags = tags.replaceAll(" "+omega, closingTag);
                sb.append(tags+"\n");
                data = data.replaceFirst(" "+alpha, "");
                if(data.contains(""+alpha))
                    data = data.substring(data.indexOf(alpha));


            }

        }
        data = data.substring(data.indexOf(alpha));
    }
        System.out.println(sb);

    }
}
