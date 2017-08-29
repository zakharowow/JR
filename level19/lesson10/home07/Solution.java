package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readFile = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writFile = new BufferedWriter(new FileWriter(args[1]));
        String out = "";
        while (readFile.ready()) {
            String[] s = readFile.readLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                if (s[i].length() > 6) out = out + s[i] + ",";
            }
        }
        writFile.write(out.substring(0, out.length() - 1));
        readFile.close();
        writFile.close();
    }
}
