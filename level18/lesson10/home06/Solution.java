package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> tree = new TreeSet<>();
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList<Character> symbols = new ArrayList<>();
        ArrayList<Integer> repeats = new ArrayList<>();

        FileInputStream br = new FileInputStream(args[0]);

        while (br.available() > 0) {
            list.add(br.read());
        }

        for (int x : list){
            tree.add(x);
        }

        for(int x : tree){
            symbols.add((char)x);
            repeats.add(Collections.frequency(list, x));
        }

        for (int i = 0; i <symbols.size(); i++){
            System.out.println(symbols.get(i) + " " + repeats.get(i));
        }

        br.close();

    }
}
