package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(10.0, "Hello");
        labels.put(10.1, "Hi");
        labels.put(10.3, "Привет");
        labels.put(10.5, "Chiao");
        labels.put(10.7, "Здорова");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
