package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        new Cat("Vasya", 11, 20, 30);
        new Cat("Misha", 11, 20, 30);
        new Cat("Vanya", 11, 20, 30);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;


        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}