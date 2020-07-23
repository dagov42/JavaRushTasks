package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        System.out.println(deep);
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] a = Thread.currentThread().getStackTrace();
        int b = a.length;
        System.out.println(b);
        return b;
    }
}

