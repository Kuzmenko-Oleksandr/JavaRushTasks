package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner a = new Scanner(System.in);  //напишите тут ваш код

        int x = a.nextInt();
        int y = a.nextInt();
        int z = a.nextInt();
        if(x == y && x != z){
            System.out.println("3");
        }
        else if(x == z && x != y ){
            System.out.println("2");
        }
        else if(y == z && y != x){
            System.out.println("1");

        }
        else {

        }

    }
}
