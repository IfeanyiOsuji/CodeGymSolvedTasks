package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen{
    public int getMonthlyEggCount(){
        return 42;
    }
    public String getDescription(){
        return super.getDescription() + "I come from "+Continent.AFRICA+". I iay "+
                getMonthlyEggCount() +" aggs a month.";
    }

}
