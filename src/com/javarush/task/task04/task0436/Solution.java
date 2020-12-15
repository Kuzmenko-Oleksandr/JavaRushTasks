package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i=0;i<x;i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
