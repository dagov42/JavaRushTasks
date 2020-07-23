package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        for (int i = 0; i < 5; i++) {
            String t = reader.readLine();
            strings.add(t);
            if (strings.get(i).length() > s.length()) {
                s = strings.get(i);
            }
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == s.length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
