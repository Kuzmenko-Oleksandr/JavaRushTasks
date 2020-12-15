package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double i = 0;
        double sum = 0;
        while (true) {
            double number = sc.nextInt();

            if (number != -1) {
                sum = sum + number;
                i++;
            }
            if (number == -1) {
                break;

            }
        }
        System.out.println(sum/i);

        }

    }
    

