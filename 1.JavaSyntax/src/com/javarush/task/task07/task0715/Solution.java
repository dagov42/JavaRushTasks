package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("именно");
        list.add("мыла");
        list.add("именно");
        list.add("раму");
        list.add("именно");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
