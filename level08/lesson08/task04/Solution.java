package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
   public static void main(String[] args) {
        System.out.println(createMap());
        removeAllSummerPeople(createMap());
    }

    public static HashMap<String, Date> createMap()
    {
            HashMap<String, Date> createMap = new HashMap<String, Date>();
            createMap.put("Stallone0", new Date("JULY 1 1980"));
            createMap.put("Stallone1", new Date("OCTOBER 1 1980"));
            createMap.put("Stallone2", new Date("JUNE 1 1980"));
            createMap.put("Stallone3", new Date("SEPTEMBER 1 1980"));
            createMap.put("Stallone4", new Date("JULY 1 1980"));
            createMap.put("Stallone5", new Date("DECEMBER 1 1980"));
            createMap.put("Stallone6", new Date("JULY 1 1980"));
            createMap.put("Stallone7", new Date("AUGUST 1 1980"));
            createMap.put("Stallone8", new Date("JULY 1 1980"));
            createMap.put("Stallone9", new Date("JULY 1 1980"));

        return createMap; //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) iterator.remove();
                //напишите тут ваш код
        }
       System.out.println("New map " + map);

    }
}
