package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age,int weight,int strenght) {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int ourCatCoefficient = this.strength * 4 + this.weight * 2 - this.age / 2;
        int anotherCatCoefficient = anotherCat.strength * 4 + anotherCat.weight * 2 - anotherCat.age / 2;
        return ourCatCoefficient > anotherCatCoefficient;
    }

    public static void main(String[] args) {
        Cat felix = new Cat( "felix",1, 3, 10);
        Cat vaska = new Cat( "vaska",2, 5, 9);
        Cat timka = new Cat( "timka ",3, 6, 8);
        if(felix.fight(vaska)){
            System.out.println("Кот " + felix.name + " победил кота " + vaska.name);
        } else {
            System.out.println("Кот " + vaska.name + " победил кота " + felix.name);
        }
        vaska.fight(felix);
        felix.fight(vaska);
        vaska.fight(timka);
    }
}
