package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> list = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
