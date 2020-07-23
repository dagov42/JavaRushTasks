package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            strings[i] = reader.readLine();
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[10 - i - 1]);
        }
    }
}