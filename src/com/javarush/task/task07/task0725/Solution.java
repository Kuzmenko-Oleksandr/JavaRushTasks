package com.javarush.task.task07.task0725;

/* 
Переставь один модификатор static
*/

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    static int C;


    public static void main(String[] args) {
    }

    public static int getValue() {
        C = A * B;
        return C;
    }
}
