package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
   /* public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Вася3"));
        System.out.println(getCountTheSameLastName(createMap(), "Федин7"));
    }*/

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            String s = Integer.toString(i);
            map.put("Федин"+s, "Вася"+s);
            //напишите тут ваш код
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        int x = 0;
        while(iter.hasNext()){
            Map.Entry<String, String> pair = iter.next();
            String val = pair.getValue();
            if (val.equals(name)) x += 1;//напишите тут ваш код
        }
        return x;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        int x = 0;
        while(iter.hasNext()){
            Map.Entry<String, String> pair = iter.next();
            String val = pair.getKey();
            if (val.equals(lastName)) x += 1;//напишите тут ваш код
        }
        return x;//напишите тут ваш код

    }
}
