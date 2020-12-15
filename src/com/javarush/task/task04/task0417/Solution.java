package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int xx = Integer.parseInt(br.readLine());
        int yy = Integer.parseInt(br.readLine());
        int zz = Integer.parseInt(br.readLine());
        int a = (int) xx;
        int x = a;
        int b = (int) yy;
        int y = b;
        int c = (int) zz;
        int z = c;
        if(x == y & x == z & y == z){
            System.out.println( x + " " + y + " " + z );
        }
        else if (x != z & x==y){
            System.out.println( x + " " + y );

        }
        else if (x != y & x==z ){
            System.out.println( x + " " + z );

        }
        else if (y != z & x==y){
            System.out.println( y + " " + x );

        }
        else if (y != x & y==z){
            System.out.println( y + " " + z );

        }

    }
}