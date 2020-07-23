package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> list = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        while (fileInputStream.available() > 0) {
            list.put(fileInputStream.read(), list.getOrDefault(fileInputStream.read(), 0) + 1);
        }
        fileInputStream.close();
        Integer min = Collections.min(list.values());
        for (Integer integer : list.keySet()) {
            if (min == list.get(integer)){
                System.out.println(integer + " ");
            }
        }
    }
}
