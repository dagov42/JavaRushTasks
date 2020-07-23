package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
            numbers[i] = strings[i].length();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
