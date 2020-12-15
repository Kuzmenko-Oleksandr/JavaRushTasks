package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrays = new int[15];
        long m = System.currentTimeMillis();
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i <arrays.length ; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0 ){
                sum = arrays[i] + sum;
            }else  {
                sum2 = arrays[i] + sum2;
            }

        }
        if (sum2 > sum ){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
            System.out.println((double) (System.currentTimeMillis() - m));
        }
        else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
            System.out.println((double) (System.currentTimeMillis() - m));
        }




    }
}
