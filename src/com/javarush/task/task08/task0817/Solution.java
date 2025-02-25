package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Кузьменко", "Александр");
        map.put("Кузьменк", "Александ");
        map.put("Кузьмен", "Александр");
        map.put("Кузьме", "Алекс");
        map.put("Кузьм", "Алекс");
        map.put("Кузь", "Александрр");
        map.put("Куз", "Александррр");
        map.put("Ку", "Александррррр");
        map.put("К", "Александр");
        map.put("Кз", "Александр");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        for(String name : copy.values()) {
            int count = 0;
            for (String nameN : map.values()) {
                if (nameN.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
