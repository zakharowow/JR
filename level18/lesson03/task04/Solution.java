package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String result = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream filereader = new FileInputStream(reader.readLine());

        TreeSet<Integer> sorted = new TreeSet<>();

        List<Integer> bytes = new ArrayList<>();

        while (filereader.available() > 0) {
            bytes.add(filereader.read());
        }

        sorted.addAll(bytes);

        System.out.println(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        int valofmin = Collections.frequency(bytes, sorted.first());

        for (int x : sorted) {
            map.put(x, Collections.frequency(bytes, x));
            if (valofmin > Collections.frequency(bytes, x)) valofmin = Collections.frequency(bytes, x);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> pair = iterator.next();
            if (pair.getValue() == (valofmin)) {
                result = pair.getKey() + " ";
            }
        }
        System.out.println(result);

        reader.close();
        filereader.close();
    }
}
