package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(source);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(fileInputStream));
        ArrayList<Integer> list = new ArrayList<>();
            String string;
            while ((string=reader1.readLine()) != null){
                    list.add(Integer.parseInt(string));
            }
            fileInputStream.close();
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) %2 == 0)
                System.out.println(list.get(i));
            }
    }
}
