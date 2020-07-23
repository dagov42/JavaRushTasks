package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] parametrs = s.split("\\?");
        for (String xz :parametrs) {
        }
        String[] parm = parametrs[1].split("\\&");


        Object o = null;
        for (String x :
                parm) {
            String[] mas = x.split("\\=");
            if(mas[0].equals("obj")){
                o = mas[1];
                System.out.print(mas[0] + " ");
            }
            else{
                System.out.print(mas[0] + " ");
            }

        }
        System.out.println();
        boolean isDouble = false;

        if (o != null) {

            try {
                if (((String) o).contains(".")) {
                    double x = Double.parseDouble((String) o);
                    alert(x);
                    isDouble = true;
                }
                else {
                    double x = Double.parseDouble((String) o);
                    isDouble = true;
                }
            } catch (Exception e) {

                if (!isDouble) {
                    try {
                        alert((String) o);
                    } catch (Exception x) {
                        System.out.println(x);
                    }
                }
            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
