package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = Math.abs(a) % 2;
        if(a<1 || a>999){
            return;
        }
        if(a<10 && b == 0){
            System.out.println("четное однозначное число");
        }
        if(a<10 && b == 1){
            System.out.println("нечетное однозначное число");
        }
        if(a<100 && a>9 && b == 0){
            System.out.println("четное двузначное число");
        }
        if(a<100 && a>9 && b ==1){
            System.out.println("нечетное двузначное число");
        }
        if(a < 1000 && a>99 && b == 0){
            System.out.println("четное трехзначное число");
        }
        if(a<1000 && a>99 && b ==1){
            System.out.println("нечетное трехзначное число");
        }
    }
}