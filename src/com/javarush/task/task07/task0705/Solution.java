package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array20 = new int[20];
        int[] array10 = new int[10];
        int[] array10_2 = new int[10];
        for (int i = 0; i < array20.length ; i++) {
           array20[i] = Integer.parseInt(br.readLine());

        }
        array10 = Arrays.copyOfRange(array20, 0, 9);
        array10_2 = Arrays.copyOfRange(array20, 10, 20);
        for (int j = 0; j < array10_2.length ; j++) {
            System.out.println(array10_2[j]);

        }
    }
}
