package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int a = Integer.parseInt(sAge);
        String nAge = reader.readLine();
        int b = Integer.parseInt(nAge);
        int sum = a + b;

        System.out.println("Sum = " + sum);
    }
}
