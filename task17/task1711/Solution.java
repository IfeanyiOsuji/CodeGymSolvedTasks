package com.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyy", Locale.ENGLISH);
        // Start here
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    create(args);
                }

                break;
            case "-u":
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    delete(args);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    printAll(args);
                }
                break;


        }

    }
    public  static  void create(String[]arg)throws  ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyy", Locale.ENGLISH);
        for(int i=1; i<arg.length; i+=3){

                Date dt = sdf.parse(arg[i+2]);
                if(arg[i+1].equals("m"))
                    allPeople.add(Person.createMale(arg[i], dt));
                else
                    allPeople.add(Person.createFemale(arg[i], dt));

                System.out.println(allPeople.size()-1);

        }

    }
    public static  void update(String [] arg)throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyy", Locale.ENGLISH);
        for(int i=1;i<arg.length;i+=4){
            Person person = allPeople.get(Integer.parseInt(arg[i]));
            person.setName(arg[i+1]);
            Date dt = sdf.parse(arg[i+3]);
            person.setBirthDate(dt);
            if(arg[i+2].equals("m"))
                person.setSex(Sex.MALE);
            else
                person.setSex(Sex.FEMALE);
        }
    }
    public static  void delete(String []arg)throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyy", Locale.ENGLISH);
        for(int i=1; i<arg.length; i++) {
            Person person = allPeople.get(Integer.parseInt(arg[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }
    public  static  void printAll(String [] arg){
        for(int i=1; i<arg.length; i++){
            Person person= allPeople.get(Integer.parseInt(arg[i]));
            String name = person.getName();
            String getGender = "";
            if(person.getSex().equals(Sex.MALE))
                getGender+="m";
            else
                getGender+="f";
            SimpleDateFormat dt = new SimpleDateFormat("MMM dd yyy", Locale.ENGLISH);
            String date = dt.format(person.getBirthDate());
            System.out.println(name+" "+getGender+" "+date);
        }
    }
}
