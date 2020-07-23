package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String , String > people = new HashMap<>();

        people.put("Petrov", "Ivan");
        people.put("Petrov", "Nikolai");
        people.put("Ivanov", "Ivan");
        people.put("Ivanov", "Petr");
        people.put("Sidorov", "Ivan");
        people.put("Sokolov", "Ivan4");
        people.put("Petrov0", "Ivan3");
        people.put("Petrov1", "Ivan4");
        people.put("Petrov2", "Ivan1");
        people.put("Petrov3", "Ivan0");
        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
