package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<Integer> list = new ArrayList<>(3);
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

            if (a == b) System.out.println(3);
            if (a == c) System.out.println(2);
            if (c == b) System.out.println(1);


    }
}
