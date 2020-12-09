package com.codegym.task.task20.task2018;

import java.io.*;

/* 
Find the bugs

*/
public class Solution implements Serializable {
    public static class A {

        protected    String nameA = "A";
        public A(){};

        public A(String nameA) {
            this.nameA += nameA;
        }
    }

    public class B extends A implements Serializable {

        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }
        private  void writeObject(ObjectOutputStream o) throws IOException{
            o.defaultWriteObject();
            o.writeObject(nameA);
            o.writeObject(nameB);
            o.flush();
            o.close();

        }
        private void readObject(ObjectInputStream o)throws IOException,ClassNotFoundException {
            o.defaultReadObject();
            this.nameA = (String)o.readObject();
            this.nameB = (String)o.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        Solution solution = new Solution();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B)ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}
