package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        FileInputStream f1 = new FileInputStream(name1);
        FileInputStream f2 = new FileInputStream(name2);

        byte [] data1 = new byte[f1.available()];
        byte [] data2 = new byte[f2.available()];

        while (f1.available() > 0){
            f1.read(data1);
        }

        while (f2.available() > 0){
            f2.read(data2);
        }
        boolean append = false;
        FileOutputStream f1wr = new FileOutputStream(name1, append);
        f1wr.write(data2);
        append = true;
        FileOutputStream f1wr2 = new FileOutputStream(name1, append);
        f1wr2.write(data1);
        f1.close();
        f1wr.close();
        f1wr2.close();
        f2.close();

        /*RandomAccessFile one = new RandomAccessFile(name1, "rw");
        RandomAccessFile two = new RandomAccessFile(name2, "r");

        byte [] buffer1 = new byte[(int)one.length()];
        byte [] buffer2 = new byte[(int)two.length()];

        one.read(buffer1);
        two.read(buffer2);
        one.seek(0);
        one.write(buffer2, 0, buffer2.length);
        one.write(buffer1, 0, buffer1.length);

        reader.close();
        one.close();
        two.close();*/


    }
}
