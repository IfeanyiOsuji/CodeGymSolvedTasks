package com.codegym.task.task18.task1828;

/* 
Prices 2

*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();


        if (args.length < 2) {
            return;
        }

        if(args[0].equals("-u")){
            ArrayList <String>d =fullList(fileName, args);
            FileWriter fw1 = new FileWriter(fileName);
            for(String x:d)
                fw1.write(x);
            fw1.close();
        } else
        if(args.length<2 && args[0].equals("-d")){
            ArrayList <String>d =deleteList(fileName, args);
            FileWriter fw1 = new FileWriter(fileName);
            for(String x:d)
                fw1.write(x);
            fw1.close();
        }



    }
    public static ArrayList<String> fullList(String fileNAme, String[] arg) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(fileNAme)));
        ArrayList<String>map = new ArrayList<>();
        String s;
        while((s=read.readLine())!=null){
            int id = Integer.parseInt(s.substring(0, 8).replaceAll(" ",""));
            int id2 = Integer.parseInt(arg[1].replaceAll(" ",""));
            String id3 = addSpaces(arg[1], 8);
            String pName = addSpaces(arg[2], 30);
            String price = addSpaces(arg[3], 8);
            String quantity = addSpaces(arg[3], 4);
            StringBuilder bd = new StringBuilder();
            bd.append(id3).append(pName).append(price).append(quantity);
            String get =bd.toString();

            map.add(s);
            if(id==id2){
                map.remove(id);
                map.add(id,get);
            }
        }
        read.close();
        return map;
    }

    public static ArrayList<String>deleteList(String fileName, String arg[]) throws IOException {
        //BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<String> map = new ArrayList<>();
        String s;
        while ((s = read.readLine()) != null) {
            map.add(s);
        }
        read.close();
        for(String v:map) {
            int id = Integer.parseInt(v.substring(0, 8).replaceAll(" ", ""));
            int id2 = Integer.parseInt(arg[1].replaceAll(" ", ""));
            if(id==id2){
                map.remove(id);
            }
        }
        return map;

    }
    public static String addSpaces(String str, int count) {
        while (str.length() < count)
        {
            str += " ";
        }
        if (str.length() > count)
            str = str.substring(0, count);
        return str;
    }
}
