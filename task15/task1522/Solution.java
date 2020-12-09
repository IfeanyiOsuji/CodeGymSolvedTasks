package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here
    static{
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // Implement step #5 here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if(s.equals("sun")){
                thePlanet =Sun.getInstance();
            }
            else if(s.equals("moon"))
                thePlanet = Moon.getInstance();
            else if(s.equals("earth"))
                thePlanet = Earth.getInstance();
            else
                thePlanet = null;

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
