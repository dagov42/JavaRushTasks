package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int height;
        private int weight;
        private String skinColor;
        private int age;
        private boolean a;
        private int b;

        public Human(int height, int weight, String skinColor, int age, boolean a, int b) {
            this.height = height;
            this.weight = weight;
            this.skinColor = skinColor;
            this.age = age;
            this.a = a;
            this.b = b;
        }

        public Human(int height, int weight, String skinColor, int age, boolean a) {
            this.height = height;
            this.weight = weight;
            this.skinColor = skinColor;
            this.age = age;
            this.a = a;
        }

        public Human(int height, int weight, String skinColor, int age) {
            this.height = height;
            this.weight = weight;
            this.skinColor = skinColor;
            this.age = age;
        }

        public Human(int height, int weight, String skinColor) {
            this.height = height;
            this.weight = weight;
            this.skinColor = skinColor;
        }

        public Human(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public Human(int height) {
            this.height = height;
        }

        public Human() {
        }

        public Human(String skinColor, boolean a, int b) {
            this.skinColor = skinColor;
            this.a = a;
            this.b = b;
        }

        public Human(String skinColor, boolean a) {
            this.skinColor = skinColor;
            this.a = a;
        }

        public Human(String skinColor, int age, boolean a) {
            this.skinColor = skinColor;
            this.age = age;
            this.a = a;
        }
    }
}
