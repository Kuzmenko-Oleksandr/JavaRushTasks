package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int xx = Integer.parseInt(br.readLine());
        int yy = Integer.parseInt(br.readLine());
        int a = (int) xx;
        int x = a;
        int b = (int) yy;
        int y = b;
        if(x>0 && y>0){
            System.out.println("1");
        }
        else if(x<0 && y>0){
            System.out.println("2");
        }
        else if(x<0 && y<0){
            System.out.println("3");
        }
        else if(x>0 && y<0){
            System.out.println("4");
        }
    }
}
