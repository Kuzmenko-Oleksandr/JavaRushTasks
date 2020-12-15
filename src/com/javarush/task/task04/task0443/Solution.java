package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String y = bufferedReader.readLine();
        String m = bufferedReader.readLine();
        String d = bufferedReader.readLine();
        int n = Integer.parseInt(y);
        int k = Integer.parseInt(m);
        int c = Integer.parseInt(d);
        System.out.println("Меня зовут "+name+".");
        System.out.print("Я родился "+d+"."+m+"."+y);
    }
}
