package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readFile = new BufferedReader(new FileReader(args[0]));
        String s;
        TreeMap<String, Double> map = new TreeMap<>();
        while ((s = readFile.readLine()) != null) {
            String[] pair = s.split(" ");
            if (!map.containsKey(pair[0])) {
                map.put(pair[0], Double.parseDouble(pair[1]));
            } else {
                map.put(pair[0], Double.parseDouble(pair[1]) + map.get(pair[0]));
            }
        }
        Iterator<Map.Entry<String, Double>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Double> pair = iter.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        readFile.close();
    }
}
