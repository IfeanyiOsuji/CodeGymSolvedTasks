package com.codegym.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        String getFile;
        while ((getFile = reader.readLine()) != null) {
            fileName = getFile;
            if (fileName.equals("exit")) {
                break;
            }

            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }


        reader.close();

    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            // Implement constructor body
            this.fileName = fileName;

        }

        // Implement file reading here
        public void run() {
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> hashMap = new HashMap<>();

            try {

                addFile(list, fileName);
               addToMap(hashMap, list);
               result(hashMap, resultMap, fileName);

            } catch (IOException e) {


            }

        }

        public static ArrayList<Integer> addFile(ArrayList<Integer> list1, String fileName) throws IOException {
            FileInputStream file = new FileInputStream(fileName);
            while (file.available() > 0) {
                list1.add(file.read());
            }
            file.close();
            Collections.sort(list1);
            return list1;
        }

        public  static HashMap<Integer, Integer> addToMap(HashMap<Integer, Integer>map, ArrayList<Integer>list1){
            for (Integer get : list1) {
                if (!map.containsKey(get)) {
                    map.put(get, Collections.frequency(list1, get));
                }
            }
            return map;

        }

        public static Map<String, Integer> result(HashMap<Integer, Integer>map1, Map<String, Integer>map2, String fileName){
            int c = Collections.max(map1.values());
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                if (entry.getValue() == c) {
                    Integer a = entry.getKey();

                    map2.put(fileName, a);
                    break;
                }
            }
            return map2;
        }
    }
}
