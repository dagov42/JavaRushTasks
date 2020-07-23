package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int a = x2 - x1;
        int b = y2 - y1;
        double distance = Math.sqrt((double) square(a) + (double) square(b));
        return distance;
    }
    public static int square(int a){
        return a * a;
    }

    public static void main(String[] args) {

    }
}
