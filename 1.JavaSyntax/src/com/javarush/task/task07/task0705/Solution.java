package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    static int[] array = new int[20];
    static int[] array10 = new int[10];
    static int[] array_10 = new int[10];
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            if (i < 10)
                array10[i] = array[i];
            else array_10[i-10] = array[i];
        }
        for (int i = 0; i < array_10.length; i++) {
            System.out.println(array_10[i]);
        }


    }
}
