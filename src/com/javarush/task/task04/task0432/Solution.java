package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        int n = Integer.parseInt(b);
        int i = 0;
        while (i < n){
            System.out.println(a);
            i++;
        }


    }
}
