package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        //напишите тут ваш код
       StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
       StackTraceElement element = stackTraceElements[2];
       String classN = element.getClassName();
       String mN = element.getMethodName();
        System.out.println(classN + ": " + mN + ": " + text);

    }
}
