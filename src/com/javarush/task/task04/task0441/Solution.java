package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a<=b && b<=c)||(a>=b && b>=c)){
            System.out.println(b);

        }
        else if ((b<=a && a<=c)||(b>=a && a>=c)){
            System.out.println(a);
        }

        else  System.out.println(c);


    }
}
