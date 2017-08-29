package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
d:\test.txt
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String result = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream filereader = new FileInputStream(reader.readLine());

        Collection<Integer> sorted = new TreeSet<>();

        List<Integer> bytes = new ArrayList<>();

        while (filereader.available() > 0) {
            bytes.add(filereader.read());
        }

        sorted.addAll(bytes);

        Map<Integer, Integer> map = new HashMap<>();

        int valofmax = 0;

        for (int x : sorted) {
            map.put(x, Collections.frequency(bytes, x));
            if (valofmax < Collections.frequency(bytes, x)) valofmax = Collections.frequency(bytes, x);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> pair = iterator.next();
            if (pair.getValue().equals(valofmax)) {
                result = pair.getKey() + " ";
            }
        }
        System.out.println(result);
        reader.close();
        filereader.close();

    }
}

