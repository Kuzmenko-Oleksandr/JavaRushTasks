package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args)  {
        System.out.println("Программа запущена");
        try {
            int a = 42 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("main end");
    }

}
