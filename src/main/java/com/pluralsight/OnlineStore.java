package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OnlineStore {
    public static void main(String[] args) {


        String filePath = "src/main/resources/products.csv";
        FileReader fileReader;
        try {
            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            String line = bufferedReader.readLine();
            while (line != null){
                String[] parts = line.split("\\|");
                String sku = parts[0];
                String productName = parts[1];
                double price = Double.parseDouble(parts[2]);
                String department = parts[3];

                Product product = new Product(sku,productName,price,department);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}