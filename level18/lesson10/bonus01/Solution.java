package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные

-e d:\test.txt
d:\test1.txt
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].equals("-e")) coding(args[1], args[2]);
        if (args[0].equals("-d")) decoding(args[1], args[2]);
    }

    public static void coding(String in, String out) throws IOException {
        FileInputStream is = new FileInputStream(in);
        FileOutputStream os = new FileOutputStream(out);
        int data;
        while (is.available() > 0) {
            data = is.read() + 1;
            os.write(data);
        }
        is.close();
        os.close();
    }

    public static void decoding(String in, String out) throws IOException {
        FileInputStream is = new FileInputStream(in);
        FileOutputStream os = new FileOutputStream(out);
        int data;
        while (is.available() > 0) {
            data = is.read() - 1;
            os.write(data);
        }
        is.close();
        os.close();
    }

}
