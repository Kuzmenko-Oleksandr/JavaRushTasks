package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[10];

        for (int i = number.length; i > 0; i--) {
            number[i-1] = Integer.parseInt(br.readLine());
        }
        for (int i : number) {
            System.out.println(i);
        }


    }
}

