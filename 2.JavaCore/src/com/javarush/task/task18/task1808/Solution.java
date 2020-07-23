package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);
        int fileSize = inputStream.available();
        while (inputStream.available() > fileSize/2){
            outputStream1.write(inputStream.read());
        }
        while (inputStream.available() > 0){
            outputStream2.write(inputStream.read());
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
