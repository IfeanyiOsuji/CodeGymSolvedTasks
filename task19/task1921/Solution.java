package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws Exception {
    /*    String get = args[0];
        FileReader file = new FileReader(get);
        String name ="";
        BufferedReader reader = new BufferedReader(file);
        String[] personalData;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyy");
        Date birthDate;
        while(reader.ready()){
            personalData = reader.readLine().split(" ");

            int len = personalData.length;
            String getdate = personalData[len-3]+" "+personalData[len-2]+" "+personalData[len-1];
            birthDate = dateFormat.parse(getdate);

           // StringBuilder sn = new StringBuilder();
            for(int i=0; i<len-3; i++){
                name = name+personalData[i]+" ";
            }

            name.trim();
            PEOPLE.add(new Person(name, birthDate));
            name="";

        }
        file.close();
        reader.close();
        for(Person person : PEOPLE) {
            System.out.println(person.getName() + person.getBirthDate());
        }

*/
        String get = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(get));

        String line;

        ArrayList<String[]> lines = new ArrayList<>();

        while ((line = fileReader.readLine()) != null) {
            lines.add(line.split(" "));
        }

        fileReader.close();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        String dateInString;
        Date birthDay;

        int month;
        int day;
        int year;

        for (int i = 0; i < lines.size(); i++) {

            String[] currentLine = lines.get(i);

            int length = currentLine.length;

            // get name
            StringBuilder fullName = new StringBuilder();
            int nameCounter = 0;
            while (nameCounter < length - 3) {
                fullName.append(currentLine[nameCounter] + " ");
                nameCounter++;
            }

            // create date
            month = Integer.parseInt(currentLine[length - 3]);
            day = Integer.parseInt(currentLine[length - 2]);
            year = Integer.parseInt(currentLine[length - 1]);

            dateInString = month + " " + day + " " + year;

            birthDay = simpleDateFormat.parse(dateInString);

            // add new person
            PEOPLE.add(new Person(fullName.toString().trim(), birthDay));
        }

        for(Person person : PEOPLE) {
            System.out.println(person.getName() + " " + person.getBirthDate());
        }


    }
}
