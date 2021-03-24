package com.javarush.task.task08.task0813;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20 ; i++) {
            set.add("Ла");
            set.add("Лв");
            set.add("Лк");
            set.add("Лц");
            set.add("Лб");
            set.add("Лаа");
            set.add("Лааа");
            set.add("Лаааа");
            set.add("Лааааа");
            set.add("Лаааааа");
            set.add("Лай");
            set.add("Лаф");
            set.add("Лас");
            set.add("Лаб");
            set.add("Лаю");
            set.add("Лав");
            set.add("Лак");
            set.add("Ласк");
            set.add("Ласааы");
            set.add("Ласывс");

        }
        return set;

    }

    public static void main(String[] args) {

    }
}
