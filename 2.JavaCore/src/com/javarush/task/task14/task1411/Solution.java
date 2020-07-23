package com.javarush.task.task14.task1411;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution implements Person {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        label:
        for (int i = 0; i < 4; i++) {
            switch (reader.readLine()) {
                case "user":
                    person = new User();
                    doWork(person); //вызываем doWork

                    break;
                case "loser":
                    person = new Loser();
                    doWork(person); //вызываем doWork

                    break;
                case "coder":
                    person = new Coder();
                    doWork(person); //вызываем doWork

                    break;
                case "proger":
                    person = new Proger();
                    doWork(person); //вызываем doWork

                    break;
                default:
                    break label;
            }
        }


    }

    public static void doWork(Person person) {
        if (person instanceof User) ((User) person).live();
        if (person instanceof Loser) ((Loser) person).doNothing();
        if (person instanceof Coder) ((Coder) person).writeCode();
        if (person instanceof Proger) ((Proger) person).enjoy();
    }
}
