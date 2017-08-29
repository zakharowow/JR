package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','

d:\test.txt

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader filereader = new BufferedReader(new FileReader(reader.readLine()));
        int count = 0;
        String s;
        while ((s = filereader.readLine()) != null) {
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i)) == ',') {
                    count++;
                }
            }
        }
        System.out.println(count);
        reader.close();
        filereader.close();
    }
}
