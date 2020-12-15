package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        {
            if (a + b > c & a + c > b & b + c > a) {
                System.out.println("Треугольник существует.");
            } else {
                    System.out.println("Треугольник не существует.");
                }

            }


        }
    }