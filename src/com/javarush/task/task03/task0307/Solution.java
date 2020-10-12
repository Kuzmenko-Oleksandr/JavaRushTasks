package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Sebek1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Sebek2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Sebek3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Sebek4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Sebek5";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();

        protoss1.name = "Putin";
        protoss2.name = "Medvedev";
        protoss3.name = "Larisa s produktovogo";


        Terran terran1 = new Terran();
        Terran terran2 =  new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();

        terran1.name = ("Zena");
        terran2.name = ("ee mama");
        terran3.name = ("ee tupaja psina");
        terran4.name = ("ee tupja kohka");

    }

    public static class Zerg {
        public String name;


    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
