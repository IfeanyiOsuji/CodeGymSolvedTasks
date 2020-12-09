package com.codegym.task.task18.task1812;

import java.io.*;
import java.util.Scanner;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    AmigoOutputStream amigoOutputStream;
    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream){
        this.amigoOutputStream=amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
       amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
            amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigoOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you really want to close the stream? Y/N");
        String decide = scan.nextLine();
        if(decide.equals("Y")){
            amigoOutputStream.close();
        }

    }
}

