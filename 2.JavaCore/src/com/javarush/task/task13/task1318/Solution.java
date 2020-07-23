package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        FileInputStream inputStreamReader = new FileInputStream(source);
        while (inputStreamReader.available() > 0){
            int s = inputStreamReader.read();
            System.out.print((char)s);
        }
        inputStreamReader.close();
        reader.close();
    }
}