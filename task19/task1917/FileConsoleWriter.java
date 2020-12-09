package com.codegym.task.task19.task1917;

/* 
Your own FileWriter

*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;
    public FileConsoleWriter(String name)throws IOException{
        this.fileWriter = new FileWriter(name);
    }
    public FileConsoleWriter(String name, boolean append)throws IOException{
        this.fileWriter = new FileWriter(name, append);
    }
    public FileConsoleWriter(File file) throws IOException{
        this.fileWriter = new FileWriter(file);
    }
    public FileConsoleWriter(File file, boolean append)throws  IOException{
        this.fileWriter = new FileWriter(file, append);
    }
    public FileConsoleWriter(FileDescriptor fd)throws IOException{
        this.fileWriter = new FileWriter(fd);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        for(int i=0; i<len; i++)
            System.out.print(cbuf[off+i]);
    }
    public void write(int c) throws IOException{
        this.fileWriter.write(c);
        System.out.println(c);
    }
    public void write(String str) throws IOException{
        this.fileWriter.write(str);
        System.out.print(str);
    }
    public void write(String str, int off, int len) throws IOException{
        this.fileWriter.write(str, off, len);
            System.out.println(str.substring(off, off+len) );
    }
    public void write(char[] cbuf) throws IOException{
        this.fileWriter.write(cbuf);
        for(int i=0; i<cbuf.length; i++)
        System.out.print(cbuf[i]);
    }
    public void close() throws IOException{
        this.fileWriter.close();
    }

    public static void main(String[] args) {

    }
    /*
    public void write(char[] cbuf, int off, int len) throws IOException
public void write(int c) throws IOException
public void write(String str) throws IOException
public void write(String str, int off, int len) throws IOException
public void write(char[] cbuf) throws IOException
public void close() throws IOException
     */

}
