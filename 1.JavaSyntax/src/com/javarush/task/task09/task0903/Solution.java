package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getLineNumber();
    }
}
