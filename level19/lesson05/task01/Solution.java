package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName_1 = reader.readLine();
        String fileName_2 = reader.readLine();
        reader.close();

        FileReader readFile_1 = new FileReader(fileName_1);
        FileWriter writeFile_2 = new FileWriter (fileName_2);

        while (readFile_1.ready()){
            readFile_1.read();
            writeFile_2.write(readFile_1.read());
        }
        readFile_1.close();
        writeFile_2.close();
    }
}
