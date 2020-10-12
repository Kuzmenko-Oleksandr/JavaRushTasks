package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour) {
        int s = hour * 3600;
        return s;
    }


    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(20));
        System.out.println(convertToSeconds(20));

    }
}
