package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("FDDD","SADSDDADADA");
        map.put("FDDD","SADSDADADA");
        map.put("SDASCDA","SADADADSDA");
        map.put("FDFADFDDD","ADDAD");
        map.put("FDDAFDDD","SADSDA");
        map.put("FDDDADD","SADSDDADAA");
        map.put("FDDADDFD","SADSDA");
        map.put("FDDDADAD","SADSDDDADA");
        map.put("FDDADADDD","SADSDA");
        map.put("FDDADDD","SADSDADADADA");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
