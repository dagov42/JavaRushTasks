package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    static int div;
    static int a;
    static int b;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        if (a <= 0) throw new NumberFormatException();
        b = Integer.parseInt(reader.readLine());
        if (b <= 0) throw new NumberFormatException();
        nod(a, b);
    }

    public static void nod(int a, int b) {
        if (a < b) {
            div = a;
            a = b;
            b = div;
            div = 0;
        }
        while (b != 0) {
            div = a % b;
            a = b;
            b = div;
        }
        System.out.println(a);
    }
}
