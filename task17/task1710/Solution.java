package com.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();
    //public static Person person;

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
        // Start here
        if(args[0].equals("-c")){
           Date dt = sdf.parse(args[3]);
           if(args[2].equals("m")) {
               allPeople.add(Person.createMale(args[1], dt));
           }
           else {
               allPeople.add(Person.createFemale(args[1], dt));
           }

           System.out.println(allPeople.size()-1);

        }
        else if(args[0].equals("-u")){
            Person person =allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
            Date dat = sdf.parse(args[4]);
            person.setBirthDate(dat);
            if(args[3].equals("m"))
                person.setSex(Sex.MALE);
            else
                    person.setSex(Sex.FEMALE);


        }
        else if(args[0].equals("-d")){
           Person person =allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            //Date dat = sdf.parse(args[4]);
            person.setBirthDate(null);
                person.setSex(null);


        }
        else if(args[0].equals("-i")){
            Person person =allPeople.get(Integer.parseInt(args[1]));
            String name = person.getName();
            String getGender="";
            if(person.getSex().equals(Sex.MALE))
                getGender +="m";
            else
                getGender+=getGender+"f";
            SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
            String dt2 = sdf2.format(person.getBirthDate());
            System.out.println(name+" "+getGender+" "+dt2);

        }


    }

}
