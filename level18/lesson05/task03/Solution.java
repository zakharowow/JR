package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file_1 = new FileInputStream(reader.readLine());
        FileOutputStream file_2 = new FileOutputStream(reader.readLine());
        FileOutputStream file_3 = new FileOutputStream(reader.readLine());

        byte [] buffer;

        if (file_1.available() % 2 == 0) {
            buffer = new byte[file_1.available()/2];
        } else {
            buffer = new byte[(file_1.available()/2)+1];
        }
        while (file_1.available() > 0) {
            int count = file_1.read(buffer);
            file_2.write(buffer, 0, count);
            count = file_1.read(buffer);
            file_3.write(buffer, 0, count);
        }

        reader.close();
        file_1.close();
        file_2.close();
        file_3.close();

    }
}

