package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        if(x < y){
            System.out.println(x);
        }
        else if(y< x){
            System.out.println(y);
        }
        else if(x == y){
            System.out.println(x | y);
        }

    }
}