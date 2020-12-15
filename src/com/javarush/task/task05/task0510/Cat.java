package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
        String name, address, color;
        int age;
        int weight;
        public void initialize(String name){
            this.name = name;
            this.weight = 10;
            this.age = 10;
            this.color = "white";
        }
        public void initialize(String name,int weight, int age ){
            this.name = name;
            this.color = "white";
            this.age = age;
            this.weight = weight;
        }
    public void initialize(String name, int age){
            this.name = name;
            this.color = "white";
            this.age = age;
            this.weight = 10;
    }
    public void initialize( int weight, String color){

            this.color = color;
            this.age = 10;
            this.weight = weight;
    }
    public void initialize(int weight,  String color,  String address){
            this.address = address;
            this.color = color;
            this.age = 10;
            this.weight = weight;
    }

}
