package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    static int[] array = new int[10];

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        reverse();
    }

    private static void reverse() {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[array.length - i-1]);
        }
    }
}

