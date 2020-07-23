package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 5;
        this.color = "Red";
        this.weight = 4;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Green";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "Blue";
        this.weight = 3;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 22;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
