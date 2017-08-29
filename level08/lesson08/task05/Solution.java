package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    /*public static void main(String[] args) {
        System.out.println("Новая мапа " + createMap());
        removeTheFirstNameDuplicates(createMap());
    }*/

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Кукин0", "Вася0");
        map.put("Кукин1", "Вася0");
        map.put("Кукин2", "Вася1");
        map.put("Кукин3", "Вася2");
        map.put("Кукин4", "Вася3");
        map.put("Кукин5", "Вася4");
        map.put("Кукин6", "Вася4");
        map.put("Кукин7", "Вася5");
        map.put("Кукин8", "Вася6");
        map.put("Кукин9", "Вася7");//напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashSet<String> keys = new HashSet<>();

        for(Map.Entry<String, String> pair : map.entrySet()){
            int i = 0;
            for(Map.Entry<String, String> pair2 : map.entrySet()){
                if (pair.getValue().equals(pair2.getValue())) i++;
            }
            if (i > 1) keys.add(pair.getValue());
        }
        for (String x : keys) removeItemFromMapByValue(map, x);
        //System.out.println("После удаления " + map);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
