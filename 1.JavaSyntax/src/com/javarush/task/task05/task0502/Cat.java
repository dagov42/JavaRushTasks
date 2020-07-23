package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int catAmount = 0;
        int anotherAmount = 0;

        if (this.age > anotherCat.age) {
            catAmount++;
        } else if (this.age == anotherCat.age) {
            anotherAmount++;
            catAmount++;
        } else anotherAmount++;

        if (this.weight > anotherCat.weight) {
            catAmount++;
        } else if (this.weight == anotherCat.weight) {
            anotherAmount++;
            catAmount++;
        } else anotherAmount++;

        if (this.strength > anotherCat.strength) {
            catAmount++;
        } else if (this.strength == anotherCat.strength) {
            anotherAmount++;
            catAmount++;
        } else anotherAmount++;
        if (catAmount == anotherAmount) {
            return false;
        } else if (catAmount > anotherAmount) {
            return true;
        } else

            return false;
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.weight = 3;
        cat1.strength = 4;
        Cat cat2 = new Cat();
        cat2.age = 6;
        cat2.strength = 7;
        cat2.weight = 4;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
