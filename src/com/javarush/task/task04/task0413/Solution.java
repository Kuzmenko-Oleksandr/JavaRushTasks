package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Scanner aa = new Scanner(System.in);
        int a = aa.nextInt();
        {
            if(1 == a ){
                System.out.println("понедельник");
            }
            if(2 == a ) {
                System.out.println("вторник");
            }
            if(3 == a ) {
                System.out.println("среда");
            }
            if(4 == a ) {
                System.out.println("четверг");
            }
            if(5 == a ) {
                System.out.println("пятница");
            }
            if(6 == a ) {
                System.out.println("суббота");
            }
            if(7 == a ) {
                System.out.println("воскресенье");
            }
            if(a == 0 || a < 0 || a > 7){
                System.out.println("такого дня недели не существует");
            }
        }



    }
}