package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        // Here's the loop for reading the keys. Item 1
        while(true)
        {
            key = reader.readLine();
            if(key.equals("user"))
            // Create an object. Item 2
                person = new Person.User();
            else
                if(key.equals("loser"))
                    person = new Person.Loser();
                else
                    if(key.equals("coder"))
                        person = new Person.Coder();
                    else
                        if(key.equals("programmer"))
                            person = new Person.Programmer();
                        else
                            break;

            doWork(person); // Call doWork

        }
    }

    public static void doWork(Person person) {
        // Item 3
        if(person instanceof Person.User){
            ((Person.User)person).live();
        }
        else
        if(person instanceof Person.Loser){
            ((Person.Loser)person).doNothing();
        }
        else
        if(person instanceof Person.Coder){
            ((Person.Coder)person).writeCode();
        }
        else
        if(person instanceof Person.Programmer){
            ((Person.Programmer)person).enjoy();
        }
        else
        {

        }

    }
}
