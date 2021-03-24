package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Кузьменко", 10000);
        map.put("Кузьменк", 499);
        map.put("Кузьмен", 599);
        map.put("Кузьме", 501);
        map.put("Кузьм", 502);
        map.put("Кузь", 200);
        map.put("Куз", 1000);
        map.put("Ку", 500);
        map.put("К", 500);
        map.put("Кузьменкоо", 500);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copy = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair : copy.entrySet()){
            Integer value = pair.getValue();
            if( value < 500){
                map.remove(pair.getKey());

            }
        }
    }

    public static void main(String[] args) {

    }
}