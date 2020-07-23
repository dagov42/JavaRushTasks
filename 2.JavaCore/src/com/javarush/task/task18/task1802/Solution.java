package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();
        System.out.println(Collections.min(list));
    }
}
