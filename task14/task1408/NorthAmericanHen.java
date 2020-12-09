package com.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {
    public int getMonthlyEggCount(){
        return 21;
    }
    public String getDescription(){
        return super.getDescription() + "I come from "+Continent.NORTHAMERICA+". I iay "+
                getMonthlyEggCount() +" aggs a month.";
    }
}
