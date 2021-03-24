package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("АлексАле","Кузя");
            map.put("АлексКузя","Кузя");
            map.put("АлексАлексАлексАлексАлексАлекс","КузяКузя");
            map.put("АлексАлекс","КузяКузя");
            map.put("АлексАлексАлекс","КузяАлекс");
            map.put("АлексАлексАлексАлексАлекс","КузяАлексАлексАлекс");
            map.put("АлексАлексАлексАлекс","КузяАлексАлек");
            map.put("АлексАлек","Куз");
            map.put("Але","Ку");
            map.put("Ал","Куя");


        }
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()){
            Map.Entry<String, String > pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(name))
            {
                count++;
            }
        }
        return count;


    }


    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()){
            Map.Entry<String, String > pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(lastName))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
