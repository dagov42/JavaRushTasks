package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GrandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(GrandFatherName, null, null);

        String GrandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(GrandMotherName, null, null);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName, null, catGrandFather);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName, catGrandMother, null);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catMother, catFather);

        String DaughterName = reader.readLine();
        Cat catDaughter = new Cat(DaughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat catFather;
        private Cat catMother;

        Cat(String name, Cat catMother, Cat catFather) {
            this.name = name;
            this.catMother = catMother;
            this.catFather = catFather;
        }

        @Override
        public String toString() {
            if (catMother == null && catFather == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (catFather==null)
                return "The cat's name is " + name + ", mother is " + catMother.name + ", no father";
            else if (catMother==null)
                return "The cat's name is " + name + ", no mother, father is " + catFather.name;
            else
                return "The cat's name is " + name + ", mother is " + catMother.name + ", father is " + catFather.name;
        }
    }

}
