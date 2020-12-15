package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] ArrayLine = new String[10];
        for (int i=0; i<8; i++){
            ArrayLine[i] = reader.readLine();


        }
        for (int j=ArrayLine.length-1; j>-1; j--){
            System.out.println(ArrayLine[j]);
        }




    }
}