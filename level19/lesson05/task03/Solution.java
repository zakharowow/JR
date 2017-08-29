package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1

d:\test.txt
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader readfile = new FileReader(file1);
        FileWriter writefile = new FileWriter(file2);

        StringBuilder sb = new StringBuilder();

        while (readfile.ready()) {
            sb.append((char)readfile.read());
        }
        String array[] = sb.toString().split(" ");

        StringBuilder sbout = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("[0-9]+")) sbout.append(array[i] + " ");
        }

        writefile.write(sbout.toString());

        readfile.close();
        writefile.close();
    }
}
