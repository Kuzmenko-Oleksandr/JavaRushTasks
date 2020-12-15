package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner k = new Scanner(System.in);
        int x = k.nextInt();
        if (x % 2 == 0 &&  x > 0){
            System.out.println("положительное четное число");
        }
        else if(x%2 != 0 && x > 0) {
            System.out.println("положительное нечетное число");

        }
        if (x % 2 == 0 &&  x < 0){
            System.out.println("отрицательное четное число");
        }
        else if(x%2 != 0 && x < 0){
            System.out.println("отрицательное нечетное число");

        }
        if(x == 0){
            System.out.println("ноль");
        }


    }
}
