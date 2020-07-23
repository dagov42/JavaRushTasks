package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static String city;
    public static String family;


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            map.put(city ,family);
        }

        String cityName = reader.readLine();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(cityName))
                System.out.println(value);
        }

    }
}
