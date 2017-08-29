package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file1 = new FileReader(reader.readLine());
        reader.close();
        StringBuilder sb = new StringBuilder();

        while (file1.ready()) {
            sb.append((char)file1.read());
        }
        file1.close();

        int count = 0;
        String text = sb.toString();
        String [] array = text.split("[\\s\\p{Punct}]");
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareToIgnoreCase("world") == 0) count++;
        }

        System.out.println(count);

    }
}
