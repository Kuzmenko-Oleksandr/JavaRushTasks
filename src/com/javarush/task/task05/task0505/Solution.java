package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat catA = new Cat("A", 10, 20, 30);
        Cat catB =new Cat("B", 11, 20, 30);
        Cat catC =new Cat("C", 15, 22, 30);
        catA.fight(catB);
        catB.fight(catC);
        catA.fight(catC);
        System.out.println();
        System.out.println();
        System.out.println();;


    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;


        }
    }
}
