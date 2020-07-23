package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    static {//1
        init();
    }

    {//4
        System.out.println("Non-static block");
        printAllFields(this);//5
    }

    public int i = 6;

    public String name = "First name";

    static {//2
        System.out.println("Static block");
    }

    public Solution() {
        System.out.println("Solution constructor");//8
        printAllFields(this);//9
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {//3
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");//5 //9
        System.out.println(obj.i);//7 //11
        System.out.println(obj.name);//6 //10
    }
}
