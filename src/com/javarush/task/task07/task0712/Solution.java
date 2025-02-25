package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        int max = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(max).length() < list.get(i).length()){
                max = i;
            }
            if(list.get(min).length() > list.get(i).length()){
                min = i;
            }

        }
        if(max < min){
            System.out.println(list.get(max));
        }
        else{
            System.out.println(list.get(min));
        }
    }
}
