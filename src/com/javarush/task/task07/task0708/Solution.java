package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings ;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(br.readLine());
        }

        int max = Integer.MIN_VALUE;
        for (String string : strings) {
            if (string.length() > max) {
                max = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == max) {
                System.out.println(string);
            }
        }
    }
}
