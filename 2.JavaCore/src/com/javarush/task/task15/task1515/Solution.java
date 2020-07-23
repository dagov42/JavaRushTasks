package com.javarush.task.task15.task1515;

/* 
Статики-2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int A;
    public static int B;

    public static int MIN = min(A, B);

    static {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            A=Integer.parseInt(reader.readLine());
            B=Integer.parseInt(reader.readLine());
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(A < B ? A : B);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
