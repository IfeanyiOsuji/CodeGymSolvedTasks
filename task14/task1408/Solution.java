package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            //write your code here
            if(continent.equalsIgnoreCase("Continent.NORTHAMERICA")){
                hen = new NorthAmericanHen();
                return hen;
            }
            else
            if(continent.equalsIgnoreCase("Continent.EUROPE")){
                hen = new EuropeanHen();
                return hen;
            }
            else
            if(continent.equalsIgnoreCase("Continent.ASIA")){
                hen = new AsianHen();
                return hen;
            }
            else
            if(continent.equalsIgnoreCase("Continent.AFRICA")){
                hen = new AfricanHen();
                return hen;
            }
            else
            return hen;
        }
    }
}








