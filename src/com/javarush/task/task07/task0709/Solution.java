package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }

        int min = Integer.MAX_VALUE;
        for (String string : list) {
            if (string.length() < min) {
                min = string.length();
            }
        }

        for (String string : list) {
            if (string.length() == min) {
                System.out.println(string);
            }
        }
    }
}
