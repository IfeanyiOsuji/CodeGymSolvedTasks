package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.*;

/* 
Introducing properties

*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap(){
        // Implement this method
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fis = new FileInputStream(reader.readLine());
            load(fis);
            reader.close();
            fis.close();
        }catch (Exception e){}
    }

    public void save(OutputStream outputStream) throws Exception {
        // Implement this method
        Properties prop = new Properties();
        try{
            if(properties !=null) {
                for (Map.Entry<String, String> entry : properties.entrySet()) {
                    // Properties prop = new Properties();
                    prop.setProperty(entry.getKey(), entry.getValue());
                }
                prop.store(outputStream, "");
            }
            outputStream.close();
        }
        catch (Exception e){}
    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method

        Properties properties = new Properties();
        properties.load(inputStream);

        Set keys = properties.keySet();
        Iterator iterator = keys.iterator();

        String key;
        String value;

        while (iterator.hasNext()) {
            key = (String) iterator.next();
            value = properties.getProperty(key);
            Solution.properties.put(key, value);
       }

        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
