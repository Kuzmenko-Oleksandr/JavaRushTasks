package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList<>();
        list.add( "мама" );
        list.add( "мыла" );
        list.add( "раму" );
        list.add(1, "именно" );
        list.add(3, "именно" );
        list.add(5, "именно" );
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
