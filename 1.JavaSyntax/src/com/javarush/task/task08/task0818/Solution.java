package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Petrov", 500);
        map.put("Petrov1", 800);
        map.put("Petrov2", 450);
        map.put("Petrov3", 700);
        map.put("Petrov4", 580);
        map.put("Petrov5", 900);
        map.put("Petrov6", 1550);
        map.put("Petrov7", 5500);
        map.put("Petrov8", 2500);
        map.put("Petrov9", 3500);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);

        for(Map.Entry<String, Integer> pair : map2.entrySet()){
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
            }
    }

    public static void main(String[] args) {

    }
}