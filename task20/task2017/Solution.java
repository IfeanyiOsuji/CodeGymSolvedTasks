package com.codegym.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*
Deserialization

*/
public class Solution {

    public A getOriginalObject(ObjectInputStream objectStream) {

        try{
            //if(objectStream.available()==0){
             //  return null;
           // }
             A get  = (A)objectStream.readObject();
             if(get instanceof A)
            return get;
             else
                 return null;
        }
        catch(Exception e){
            //System.out.println(e.getMessage());
            return null;
        }

    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
