package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
      int i = 0;  
        int n = strings.size();
        while (i < n) {                                                  
            if (strings.get(i).contains("р") && strings.get(i).contains("л")) 
                ++i;                                                  
            else if (strings.get(i).contains("р")) {
                strings.remove(i);                  
                --n;
            }
            else if (strings.get(i).contains("л")) {
                strings.add(strings.get(i)); 
                ++i; 
            
            } 
            else 
                ++i;                                                  
        }
        return strings; 
    }
}