package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int min;
        int max;

        if (a == b && b == c) System.out.println(a);
        if (a == b && a != c) System.out.println(a);
        if (b == c && c != a) System.out.println(b);
        if (a == c && b != c) System.out.println(c);
        if (a > b && b > c || a < b && b < c || c > b && b > a) System.out.println(b);
        if (b > a && a > c || b < a && a < c || c > a && a > b) System.out.println(a);
        if (b > c && c > a || b < c && c < a || a > c && c > b) System.out.println(c);
    }
}
