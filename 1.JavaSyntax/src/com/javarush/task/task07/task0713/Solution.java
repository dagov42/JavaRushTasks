package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer integer : list) {
            if (integer %3 == 0)
                list1.add(integer);
            if (integer %2 == 0)
                list2.add(integer);
            if (!(integer %3 == 0) && !(integer %2 == 0))list3.add(integer);
        }
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
