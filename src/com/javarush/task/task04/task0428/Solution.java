package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner k = new Scanner(System.in);
        int x = k.nextInt();
        int y = k.nextInt();
        int z = k.nextInt();
        if (x>0 && y>0 && z>0){
            System.out.print(3);
        }

        if (x<=0 && y<=0 && z<=0){
            System.out.print(0);
        }

        if ((x>0 && y>0 && z<=0) || (x>0 && y<=0 && z>0) || (x<=0 && y>0 && z>0)){
            System.out.print(2);
        }
        if ((x>0 && y<=0 && z<=0) || (x<=0 && y>0 && z<=0) || (x<=0 && y<=0 && z>0)){
            System.out.print(1);
        }

    }
}
