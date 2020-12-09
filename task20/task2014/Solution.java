package com.codegym.task.task20.task2014;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution(4));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
     private transient Date currentDate;
    private transient int temperature;
    String string;
    //Solution saveObject;
   // Solution loadObject;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

    //public void write(ObjectOutput o) throws Exception{
      //  if(saveObject!=null){
        //    saveObject = new Solution(temperature);
         //   o.writeObject(saveObject);
        //}
   // }
    //public void read(ObjectInput in) throws Exception{
      //  loadObject =  (Solution) in.readObject();

    //}
}
