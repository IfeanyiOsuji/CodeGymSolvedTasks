package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args)throws IOException {
        //write your code here
       // String a = "http://codegym.cc/alpha/index.html?lvl=15&view&name=Amigo";
        //String b = "http://codegym.cc/alpha/index.html?obj=3.14&name=Amigo";
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String get = read.readLine();
        String [] split = get.split("\\?");
        String [] split1 = split[1].split("&");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listObj = new ArrayList<>();

        for(int i=0; i< split1.length; i++){
            if(split1[i].contains("=")){
                String [] ad = split1[i].split("=");
                if(ad[0].contains("obj")){
                    list.add(ad[0]);
                    listObj.add(ad[1]);
                }
                else{list.add(ad[0]);}
            }
            else{list.add(split1[i]);}
        }

        for(int a = 0; a<list.size(); a++){
            if(a!=list.size()-1){
                System.out.print(list.get(a)+ " ");
            }
            else{
                System.out.print(list.get(a)+ "\n");
            }
        }
        for(String b:listObj){
            try {
                double c = Double.parseDouble(b);
                alert(c);
                break;
            }
            catch(Exception e){
                alert(b);
            }

        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
