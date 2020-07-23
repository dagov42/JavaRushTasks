package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        System.out.println(list.size());
        for (String a:list) {
            System.out.println(a);
        }
    }
}
