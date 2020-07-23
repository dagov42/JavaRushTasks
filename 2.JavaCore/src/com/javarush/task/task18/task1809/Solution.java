package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        List<Byte> list = new ArrayList<>();
        List<Byte> list1 = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        while (inputStream.available()>0){
            list.add((byte) inputStream.read());
        }
        for (int i = list.size()-1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            outputStream.write(list1.get(i));
        }
        reader.close();
        inputStream.close();
        outputStream.close();

    }
}
