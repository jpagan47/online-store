package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

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


    }
}