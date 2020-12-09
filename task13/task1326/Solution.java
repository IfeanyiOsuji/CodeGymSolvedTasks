package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
     static int n;
     static String get;
    static String data;
    public static void main(String[] args)throws Exception {
        //write your code here

       /* BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            String go = read.readLine();
            FileInputStream file = new FileInputStream(go);

            byte[] temp = new byte[file.available()];
            file.read(temp);

            String result = new String(temp);
            String[] dot = result.split("");
            for (int y = 0; y < list.size(); y++) {
                if (Integer.parseInt(dot[y]) % 2 == 0) {
                    list.add(Integer.parseInt(dot[y]));
                } else {
                }


            }
            file.close();
            read.close();
        }
        catch (Exception e){

        }

        Collections.sort(list);

        for(Integer s : list)
            System.out.println(s);


            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String go = read.readLine();
        FileInputStream file = new FileInputStream(go);
       try{


          // BufferedReader get = new BufferedReader(new InputStreamReader(file));
           ArrayList<Integer> list = new ArrayList<>();
           ArrayList<Integer>list1 = new ArrayList<>();
        Scanner scanner = new Scanner(file);
           while(file.available()>0&& scanner.hasNext()){

            int a = scanner.nextInt();
                list.add(a);



        }
           file.close();
           read.close();
           scanner.close();
        //get.close();


        Collections.sort(list);
           for(Integer d: list) {
               if(d/2==0)
               System.out.println(d);
           }
        }
       catch (Exception e){
       }

        */
        Scanner sc = new Scanner(System.in);
        FileInputStream inputfile = new FileInputStream(sc.nextLine());
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputfile));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        Collections.sort(list);
        for (Integer x : list)
            if (x % 2 == 0)
                System.out.println(x);
        reader.close();
        inputfile.close();


    }
}
