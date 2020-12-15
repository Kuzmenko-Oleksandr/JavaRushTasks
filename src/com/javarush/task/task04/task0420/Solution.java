package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();
        if(a <= b && b <= c) {
            System.out.println(c + " " + b + " " + a);
        }
        else if(b <= a && a <= c){
            System.out.println(c + " " + a + " " + b);
        }
        else if(c <= a && a <= b){
            System.out.println(b + " " + a + " " + c);
        }

    }
}
