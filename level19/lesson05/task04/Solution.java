package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileReader readfile = new FileReader(file1);
        FileWriter writefile = new FileWriter(file2, true);

        while (readfile.ready()) {
            int data = readfile.read();
            if ((char) data == '.') {
                writefile.write('!');
            } else writefile.write((char)data);

        }
        readfile.close();
        writefile.close();
    }
}
