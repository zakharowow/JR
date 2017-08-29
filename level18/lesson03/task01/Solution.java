package com.javarush.test.level18.lesson03.task01;

import java.io.*;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedInputStream filereader = new BufferedInputStream(new FileInputStream(reader.readLine()));
        while(filereader.available() > 0){
            int data = filereader.read();
            if (data > max) max = data;
        }
        System.out.println(max);
        reader.close();
        filereader.close();
    }
}
