package com.javarush.task.task08.task0812;

import java.io.IOException;
import java.io.*;
import java.util.HashMap;
import java.util.Collection;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++){
            int increment = 0;
            int key = Integer.parseInt(reader.readLine());
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int max = Collections.max(map.values());
        System.out.println(max);
   
  

    }
}