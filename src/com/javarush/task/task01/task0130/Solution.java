package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        double TC = celsius;
        double b = 9/5.0 * TC +32;
        double TF = (9 / 5.0) * TC + 32;
        return b;

    }
}