package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        return string;

    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int integer = Integer.parseInt(reader.readLine());
        return integer;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double doubl = Double.parseDouble(reader.readLine());
        return doubl;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean boo = Boolean.parseBoolean(reader.readLine());
        return boo;
    }

    public static void main(String[] args) throws Exception {

    }
}
