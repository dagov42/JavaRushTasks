package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int left, top, width, height;

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public Rectangle(int width) {
        this.width = width;
    }

    public Rectangle() {
    }

    public static void main(String[] args) {

    }
}
