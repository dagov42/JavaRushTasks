package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int j = 0; j < 13; j++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        for (int k = 0; k < 5; k++) {
            System.out.println(list.get(k));
        }
    }
}
