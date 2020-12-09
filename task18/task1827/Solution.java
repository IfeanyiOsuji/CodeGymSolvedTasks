package com.codegym.task.task18.task1827;

/* 
Prices

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length>0 &&args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String fileName = reader.readLine();
             reader.close();


            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            // BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));

            ArrayList<String> fileData = allProducts(fileName);
            String productID = getID(fileData);
            String productName = fullName(args[1]);
            String productPrice = fullPrice(args[2]);
            String productQuantity = fullQuantity(args[3]);
            String product = productID + productName + productPrice + productQuantity;


            fileData.add(product);

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));


            for (int i = 0; i < fileData.size() - 1; i++) {
                writer.write(fileData.get(i));
                writer.newLine();
            }
            writer.write(fileData.get(fileData.size() - 1));


            //reader.close();


            writer.close();
            fileOutputStream.close();


        }
    }

    //get ID
    public static String getID(ArrayList<String> products) {
        ArrayList<Integer> productIDs = productIDs(products);
        int id = productIDs.get(productIDs.size()-1) +1;
        return fullID(id);
    }


    //return sorted ArrayList of product IDs
    public static ArrayList<Integer> productIDs(ArrayList<String> list) {
        ArrayList<Integer> productIDs = new ArrayList<>();
        for (String string : list){
            productIDs.add(getProductID(string));
        }
        Collections.sort(productIDs);
        return productIDs;
    }

    //get the ID of a product
    public static int getProductID(String product){
        String productIDString = product.substring(0, 8);
        return Integer.parseInt(productIDString.replaceAll(" ", ""));

       // return productID;
    }

    // return ArrayList of all products in the file
    public static ArrayList<String> allProducts(String fileName) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<String> products = new ArrayList<>();
        String s;
        while ((s = reader.readLine())!=null){
            products.add(s);
        }
        reader.close();
        return products;
   }


    //make sure ID is 8 characters long
    public static String fullID(int id){
        StringBuilder idAsString = new StringBuilder(String.valueOf(id));
        while (idAsString.length()!=8){
            idAsString.append(" ");
        }
        return idAsString.toString();
    }

    //make sure product name is 30 characters long
    public static String fullName(String name){
        StringBuilder fullName = new StringBuilder(name);
        while (fullName.length()!=30){
            fullName.append(" ");
        }
        return fullName.toString();
    }

    //make sure price is 8 characters long
    public static String fullPrice(String s){
        StringBuilder price = new StringBuilder(s);
        while (price.length()!=8){
            price.append(" ");
        }
        return price.toString();
    }

    //make sure quantity is 4 characters long
    public static String fullQuantity(String s){
        StringBuilder quantity = new StringBuilder(s);
        while (quantity.length()!=4){
            quantity.append(" ");
        }
        return quantity.toString();
    }


}

