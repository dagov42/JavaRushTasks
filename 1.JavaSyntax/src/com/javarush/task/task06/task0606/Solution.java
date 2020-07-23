package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        recursion(number);
        System.out.println("Even: "+ even + " Odd: "+ odd);
    }

    public static void recursion(int number) {
        if (number > 0){
            String string = Integer.toString(number);
            int[] digits = new int[string.length()];

            for (int i = 0; i < string.length(); i++) {
                digits[i] = Integer.parseInt(string.substring(i, i+1));
                if (digits[i]%2 ==0) even++;
                else odd++;
            }
        }
    }
}
