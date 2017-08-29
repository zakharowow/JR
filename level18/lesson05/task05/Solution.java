package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = null;
        String s;
        while((s = reader.readLine()) != null){
        file = new FileInputStream(s);
            if (file.available() > 1000) throw new DownloadException();
        }

        reader.close();
        file.close();
    }

    public static class DownloadException extends Exception{

    }
}