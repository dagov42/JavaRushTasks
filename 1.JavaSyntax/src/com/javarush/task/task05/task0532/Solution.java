package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        if (maximum > 0){
            for (int i = 0; i < maximum; i++) {
                list.add(Integer.parseInt(reader.readLine()));
            }
            System.out.println(Collections.max(list));
        }
    }
}
