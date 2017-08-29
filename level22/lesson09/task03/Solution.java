package com.javarush.test.level22.lesson09.task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
d:\\test.txt
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        StringBuilder text = new StringBuilder();
        while (fileReader.ready()) {
            text.append(fileReader.readLine() + " ");
        }

        String[] array = text.toString().trim().split("\\s+");

        //...
        StringBuilder result = getLine(array);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {

        String s = "";
        int count;


        for (int j = 0; j < words.length; j++) {
            List<String> list = new ArrayList<>(Arrays.asList(words));
            count = 1;
            s = list.get(j);
            list.set(j, null);
            for (int k = 0; k < list.size(); k++) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.size() != 0 && list.get(i) != null && s.substring(s.length() - 1).equalsIgnoreCase(list.get(i).substring(0, 1))) {
                        s = s + " " + list.get(i);
                        list.set(i, null);
                        count++;
                    }
                    if (list.size() != 0 && list.get(i) != null && s.substring(0, 1).equalsIgnoreCase(list.get(i).substring(list.get(i).length() - 1))) {
                        s = list.get(i) + " " + s;
                        list.set(i, null);
                        count++;
                    }
                }
                if (count == words.length) break;
            }
        }

        return new StringBuilder(s);
    }
}
