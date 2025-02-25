package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = a.length();

        for (int i = 0; i < b; i++) {
            char ch = a.charAt(i);
            int c = Character.getNumericValue(ch);

            if(c!=0){
                if(c %2 == 0)
                    even ++;

                else odd ++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
