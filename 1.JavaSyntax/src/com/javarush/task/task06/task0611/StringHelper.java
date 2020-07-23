package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/


import java.util.Collections;

public class StringHelper {
    public static String multiply(String s) {
        String result = s;
         return String.join("", Collections.nCopies(5, result));
    }

    public static String multiply(String s, int count) {
        String result = s;
        return String.join("", Collections.nCopies(count, result));
    }

    public static void main(String[] args) {

    }
}
