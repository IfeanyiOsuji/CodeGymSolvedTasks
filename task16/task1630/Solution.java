package com.codegym.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //write your code here
    static{
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            firstFileName = reader.readLine();
            secondFileName = reader.readLine();

            //BufferedReader reader2 = new BufferedReader(new FileReader(secondFileName));
            //reader.close();
        }

        catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();

        f.setFileName(fileName);
        f.start();
        //write your code here
        f.join();
        System.out.println(f.getFileContents());


    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    //write your code here
    public static class ReadFileThread extends Thread  implements  ReadFileInterface {
  /*     String fullFileName;
        String fileContent="";
        public void setFileName(String fullFileName){
            this.fullFileName = fullFileName;

        }
        public void run(){

            try {
                FileInputStream stream = new FileInputStream(fullFileName);
                BufferedReader read = new BufferedReader(new InputStreamReader(stream));
                String s;
                fileContent=read.readLine();
                while((s=read.readLine())!=null){
                    fileContent+=" "+s;
                }
                stream.close();
                read.close();


               FileInputStream inputStream = new FileInputStream(fullFileName);

// sets a buffer to exact size needed
                byte[] temp = new byte[inputStream.available()];

// reads from the stream all available bytes
                inputStream.read(temp); // temp now contains all data

// converts data to string
                fileContent = new String(temp).replaceAll("\r","").replaceAll("\n"," ");
// then removes all carriage returns and replace new lines with space


            }



            catch(IOException e){
                e.printStackTrace();
            }


        }


        public String getFileContents(){
            return fileContent;
        }

        //public  void join()throws InterruptedException{}
        public void start(){}

*/
       String fullFileName;
        ArrayList<String> list = new ArrayList<>();

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fullFileName);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

                while (reader.ready())
                    list.add(reader.readLine());

                reader.close();
                fileInputStream.close();
            } catch (IOException e) { }
        }

        //@Override
        public String getFileContents() {
            if(list.isEmpty()) return "";
            String stringFinish = list.get(0);

            for (int i = 1; i < list.size(); i++)
                stringFinish = stringFinish + " " + list.get(i);

            return stringFinish;
        }


    }

}
