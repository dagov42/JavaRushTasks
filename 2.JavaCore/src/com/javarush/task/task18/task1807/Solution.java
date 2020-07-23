package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream inputStream = new FileInputStream(filename);
        char c = ',';
        int commaCount = 0;
        while (inputStream.available() > 0) {
            if ((char) inputStream.read() == c)
                commaCount++;
        }
        inputStream.close();
        System.out.println(commaCount);
    }
}
