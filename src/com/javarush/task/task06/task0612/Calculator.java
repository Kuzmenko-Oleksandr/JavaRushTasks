package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int sum = a - b;
        return sum;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int sum = a * b;
        return sum;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double sum =((double) a)/((double) b);
        return sum;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double z = ((double) a / 100) * ((double) b);
        return z;
    }

    public static void main(String[] args) {

    }
}