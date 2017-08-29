package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new HashMap<>();
        String s;
        while ((s = reader.readLine()) != null) {
            if (!map.containsKey(s.split(" ")[0])) {
                map.put(s.split(" ")[0], Double.parseDouble(s.split(" ")[1]));
            } else {
                map.put(s.split(" ")[0], map.get(s.split(" ")[0]) + Double.parseDouble(s.split(" ")[1]));
            }
        }
        reader.close();

        Iterator<Map.Entry<String, Double>> iter = map.entrySet().iterator();
        double max = 0;
        while (iter.hasNext()) {
            Map.Entry<String, Double> pair = iter.next();
            if (pair.getValue() > max) {
                max = pair.getValue();
            }
        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() == max) {
                System.out.println(pair.getKey());
            }
        }
    }
}
