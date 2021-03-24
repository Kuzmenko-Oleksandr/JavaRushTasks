package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Дуров", dateFormat.parse("JANUARY 1 2012"));
        map.put("Муров", dateFormat.parse("JUNE 1 2012"));
        map.put("Куров", dateFormat.parse("JULY 1 2012"));
        map.put("Пуров", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Мутов", dateFormat.parse("AUGUST 1 2012"));
        map.put("Рири", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Мири", dateFormat.parse("MAY 12 2012"));
        map.put("Бури", dateFormat.parse("MARCH 1 2012"));
        map.put("Мури", dateFormat.parse("APRIL 1 2012"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> copy = new HashMap<>(map);
        for(Map.Entry<String, Date> pair : copy.entrySet()){
            Date value = pair.getValue();
            if(pair.getValue().getMonth()> 4 && pair.getValue().getMonth()< 8){
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) throws ParseException  {

    }
}
