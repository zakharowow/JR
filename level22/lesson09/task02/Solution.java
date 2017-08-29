package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        if (params != null){
        Iterator<Map.Entry<String, String>> iter = params.entrySet().iterator();
        String key, val;
        while (iter.hasNext()){
            Map.Entry<String, String> pair = iter.next();

            if ((key = pair.getKey()) != null && (val = pair.getValue()) != null)
                sb.append(key + " = " + "'" + val + "'" + " and ");

        }}
        if (sb.length() != 0) {sb = sb.delete(sb.length()-5, sb.length());}
        return sb;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        map.put(null, null);
        map.put(null, null);


        System.out.println(getCondition(map));


    }
}
